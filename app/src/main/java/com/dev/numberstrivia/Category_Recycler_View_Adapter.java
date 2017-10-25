package com.dev.numberstrivia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by Devesh Chaturvedi on 014-14-10-2017.
 */

public class Category_Recycler_View_Adapter extends RecyclerView.Adapter<Category_View_Holder>{

    List<Category> list = Collections.emptyList();
    Context context;
    private int expandedPosition = -1;

    public Category_Recycler_View_Adapter(List<Category> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public Category_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.random_fact_layout, parent, false);
        Category_View_Holder holder = new Category_View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(final Category_View_Holder holder, int position) {
        holder.categoryTitle.setText(list.get(position).getmTitle());
//        if (position == expandedPosition) {
//            holder.expandedView.setVisibility(View.VISIBLE);
//        } else {
//            holder.expandedView.setVisibility(View.GONE);
//        }
    }


//    @Override
//    public void onClick(View view) {
//        ViewHolder holder = (ViewHolder) view.getTag();
//
//        // Check for an expanded view, collapse if you find one
//        if (expandedPosition >= 0) {
//            int prev = expandedPosition;
//            notifyItemChanged(prev);
//        }
//        // Set the current position to "expanded"
//        expandedPosition = holder.getPosition();
//        notifyItemChanged(expandedPosition);
//
//    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView
    public void insert(int position, Category category) {
        list.add(position, category);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing the Category object
    public void remove(Category category) {
        int position = list.indexOf(category);
        list.remove(position);
        notifyItemRemoved(position);
    }
    public Category getItem(int position){

        return list.get(position);
    }

}
