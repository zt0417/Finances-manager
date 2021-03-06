package com.tongzhang.financesmanager;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.tongzhang.financesmanager.bean.Tab;
import com.tongzhang.financesmanager.fragment.DetailFragment;
import com.tongzhang.financesmanager.fragment.HomeFragment;
import com.tongzhang.financesmanager.fragment.MineFragment;
import com.tongzhang.financesmanager.widget.FragmentTabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private LayoutInflater mInflater;
    private FragmentTabHost mTabhost;

    private List<Tab> mTab = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTab();
    }

    private void initTab() {

        Tab tab_home = new Tab(R.string.home,R.drawable.selector_icon_home,HomeFragment.class);
        Tab tab_detail = new Tab(R.string.detail,R.drawable.selector_icon_detail,DetailFragment.class);
        Tab tab_mine = new Tab(R.string.mine,R.drawable.selector_icon_mine,MineFragment.class);

        mTab.add(tab_home);
        mTab.add(tab_detail);
        mTab.add(tab_mine);

        mInflater=LayoutInflater.from(this);
        mTabhost = (FragmentTabHost) this.findViewById(android.R.id.tabhost);
        mTabhost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);

        for(Tab tab:mTab) {
            TabHost.TabSpec tabSpec=mTabhost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabhost.addTab(tabSpec, tab.getFragment(),null);
        }
    }

    private  View buildIndicator(Tab tab) {

        View view=mInflater.inflate(R.layout.tab_indicator,null);
        ImageView img=(ImageView)view.findViewById(R.id.icon_tab);
        TextView text=(TextView)view.findViewById(R.id.txt_indicator);

        img.setBackgroundResource(tab.getIcon());
        text.setText(tab.getTitle());

        return view;
    }


}
