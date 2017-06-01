package com.tongzhang.financesmanager.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tongzhang.financesmanager.R;
import com.tongzhang.financesmanager.adapter.MyAdatper;

import java.util.ArrayList;
import java.util.List;


import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import de.greenrobot.event.EventBus;


/**
 * Created by zt041 on 2017-03-22.
 */

public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private List<String> datas = new ArrayList<>();
    private MyAdatper mAdatper;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);
        mRecyclerView= (RecyclerView) view.findViewById(R.id.recycler_view);
        mAdatper = new MyAdatper(datas);
        mRecyclerView.setAdapter(mAdatper);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));



        mAdatper.setOnItemClickListener(new MyAdatper.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Toast.makeText(getActivity(), "click : "+datas.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(getActivity(), "long click : " +position,Toast.LENGTH_SHORT).show();
            }
        });



        initDates();
        return view;
    }





    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
        mAdatper = new MyAdatper(datas);
        mRecyclerView.setAdapter(mAdatper);

        mAdatper.setOnItemClickListener(new MyAdatper.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity(), "click : "+datas.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(getActivity(), "long click : " +position,Toast.LENGTH_SHORT).show();
            }
        });

        //register
        EventBus.getDefault().register(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }


    private void initDates(){

        datas.add("clothes");
        datas.add("vegetable");
        datas.add("fruit");
        datas.add("rent");
        datas.add("water");
        datas.add("pen");
        datas.add("school");
        datas.add("snack");
        datas.add("beer");
        datas.add("friend");
        datas.add("travel");
        datas.add("marry");
        datas.add("child");
        datas.add("parent");
        datas.add("clothes");
        datas.add("vegetable");
        datas.add("clothes");
        datas.add("vegetable");
        datas.add("fruit");
        datas.add("rent");
        datas.add("water");
        datas.add("pen");
        datas.add("school");
        datas.add("snack");
        datas.add("beer");
        datas.add("friend");
        datas.add("travel");
        datas.add("marry");
        datas.add("child");
        datas.add("parent");
        datas.add("clothes");
        datas.add("vegetable");

    }
}
