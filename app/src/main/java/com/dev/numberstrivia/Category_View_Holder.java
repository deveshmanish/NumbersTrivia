package com.dev.numberstrivia;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Devesh Chaturvedi on 014-14-10-2017.
 */

public class Category_View_Holder extends RecyclerView.ViewHolder {

    CardView category;
//    CardView expandedView;
    TextView categoryTitle;
//    ImageView submitQuery;
//    EditText queryText;
//    Button random;

    Category_View_Holder(View itemView) {
        super(itemView);
        category = (CardView) itemView.findViewById(R.id.categorycardView);
        categoryTitle = (TextView) itemView.findViewById(R.id.category);
//        expandedView = (CardView) itemView.findViewById(R.id.secondary_card_view);
//        random = (Button) itemView.findViewById(R.id.random_button);
//        queryText = (EditText) itemView.findViewById(R.id.specific_qurey);
//        submitQuery = (ImageView) itemView.findViewById(R.id.query_button);
    }

}