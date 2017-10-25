package com.dev.numberstrivia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Category_Recycler_View_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> category = loadCategory();
        Log.e("Category",category.get(0).getmTitle());
        Log.e("Category",category.get(1).getmTitle());
        Log.e("Category",category.get(2).getmTitle());
        Log.e("Category",category.get(3).getmTitle());
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new Category_Recycler_View_Adapter(category, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.addOnItemTouchListener(new CustomRecyclerViewItemTouchListener(this, recyclerView, new RecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                Intent intent = new Intent(MainActivity.this, TriviaActivity.class);
                recyclerView.getAdapter().getItemId(position);
                intent.putExtra("category", adapter.getItem(position).getmTitle().toLowerCase());
                startActivity(intent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }
    public List<Category> loadCategory(){
        List<Category> categories = new ArrayList<>();
        Category category;
        category= new Category("Trivia");
        categories.add(category);
        category= new Category("Math");
        categories.add(category);
        category= new Category("Date");
        categories.add(category);
        category= new Category("Year");
        categories.add(category);

        return categories;
    }
}
