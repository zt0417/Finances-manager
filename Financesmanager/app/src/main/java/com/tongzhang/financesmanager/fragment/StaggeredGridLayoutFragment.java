package com.tongzhang.financesmanager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tongzhang.financesmanager.R;
import com.tongzhang.financesmanager.adapter.MyAdatper;
import com.tongzhang.financesmanager.adapter.StaggeredAdatper;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by zt041 on 2017-03-22.
 */

public class StaggeredGridLayoutFragment extends Fragment{



    private RecyclerView mRecyclerView;
    private List<String> datas = new ArrayList<>();

    private StaggeredAdatper mAdatper;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);


        mRecyclerView= (RecyclerView) view.findViewById(R.id.recycler_view);
        mAdatper = new StaggeredAdatper(getActivity(),datas);
        mRecyclerView.setAdapter(mAdatper);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        initDates();


        //mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.HORIZONTAL_LIST));
        return view;
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


    }



}
