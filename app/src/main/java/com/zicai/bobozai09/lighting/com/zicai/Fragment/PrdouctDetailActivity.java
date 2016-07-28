package com.zicai.bobozai09.lighting.com.zicai.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.zicai.bobozai09.lighting.R;

public class PrdouctDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prdouct_detail);


        LayoutInflater inflater = getLayoutInflater();

        LinearLayout layoutBottomNav = (LinearLayout) findViewById(R.id.bottom_nav);

        LinearLayout layoutBottomNavContent = (LinearLayout) inflater.inflate(R.layout.product_detail_bottom_nav, null).findViewById(R.id.ProductDetailBottomNavLayout);
        if (layoutBottomNav != null && layoutBottomNavContent != null) {
            layoutBottomNav.addView(layoutBottomNavContent);
        }

    }
}
