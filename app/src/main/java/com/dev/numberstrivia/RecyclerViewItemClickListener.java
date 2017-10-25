package com.dev.numberstrivia;

import android.view.View;

/**
 * Created by Devesh Chaturvedi on 014-14-10-2017.
 */

public interface RecyclerViewItemClickListener {
    public void onClick(View view, int position);

    public void onLongClick(View view, int position);
}