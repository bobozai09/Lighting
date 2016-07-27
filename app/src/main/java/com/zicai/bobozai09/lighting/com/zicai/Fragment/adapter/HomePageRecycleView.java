package com.zicai.bobozai09.lighting.com.zicai.Fragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zicai.bobozai09.lighting.R;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;


/**
 * Created by bobozai09 on 2016/7/27.
 */

public class HomePageRecycleView extends RecyclerView.Adapter<HomePageRecycleView.HomepageHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;

    public HomePageRecycleView(Context context) {
//        mTitles=context.getResources().getStringArray()
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public HomepageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomepageHolder(mLayoutInflater.inflate(R.layout.item_homepage, parent, false));
    }

    @Override
    public void onBindViewHolder(HomepageHolder holder, int position) {
//        holder.mTextView.setText(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class HomepageHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.text_view)
        TextView textView;


        public HomepageHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("HomepageHolder", "onclicklistener");
                }
            });
        }

    }
}
