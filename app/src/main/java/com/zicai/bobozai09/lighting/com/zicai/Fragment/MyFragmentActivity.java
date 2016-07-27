package com.zicai.bobozai09.lighting.com.zicai.Fragment;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.zicai.bobozai09.lighting.R;

/**
 * Created by bobozai09 on 2016/7/27.
 */

public class MyFragmentActivity extends FragmentActivity {
    private FragmentTabHost mTabhost;
    private Class FragmentArray[] = {HomeFragment.class, MessageFragment.class, MineFragment.class,ReportFragment.class};
    private int iconArray[] = { R.drawable.jiasu_d,R.drawable.zhanghu_d,R.drawable.bangzhu_d, R.drawable.daoahang_d};
    private String titleArray[] = {"加速", "账户", "帮助","导航"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabhost = (FragmentTabHost) findViewById(R.id.tabhost);
        setupTabView();
    }

    private void setupTabView() {
        mTabhost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabhost.getTabWidget().setDividerDrawable(null);
        int count = FragmentArray.length;
        for (int i = 0; i < count; i++) {
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(titleArray[i]).setIndicator(getTabItemView(i));
            mTabhost.addTab(tabSpec,FragmentArray[i],null);
            mTabhost.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.tab_item);
        }
    }
    private View getTabItemView(int index) {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View view = layoutInflater.inflate(R.layout.tab_bottom_nav, null);
        XmlResourceParser parser = this.getResources().getLayout(R.layout.tab_bottom_nav);
        final AttributeSet attrs = Xml.asAttributeSet(parser);
        final String name = parser.getName();
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        imageView.setImageResource(iconArray[index]);
        TextView textView = (TextView) view.findViewById(R.id.tv_icon);
        textView.setText(titleArray[index]);
        return view;

    }
}
