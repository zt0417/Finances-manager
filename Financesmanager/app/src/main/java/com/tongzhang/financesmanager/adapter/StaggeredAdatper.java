package com.tongzhang.financesmanager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import com.tongzhang.financesmanager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zt041 on 2017-03-29.
 */

public class StaggeredAdatper extends RecyclerView.Adapter<StaggeredAdatper.ViewHolder> {

    private List<String> mDatas;
    public  LayoutInflater mInflater;
    private Context mContext;
    private  List<Integer> mHeights;

    public StaggeredAdatper(Context context, List<String> datas) {

        this.mContext=context;
        this.mDatas = datas;
        mInflater=LayoutInflater.from(context);


        mHeights=new ArrayList<Integer>();
        for( int i=0;i<mDatas.size();i++) {
            mHeights.add((int)(100+Math.random()*300));
        }
    }

    @Override
    public int getItemCount() {

        return mDatas.size();
    }


    @Override
    public void onBindViewHolder(StaggeredAdatper.ViewHolder holder, int position) {

        LayoutParams lp=holder.itemView.getLayoutParams();
        lp.height=mHeights.get(position);
        holder.textView.setLayoutParams(lp);
        holder.textView.setText(mDatas.get(position));
    }

    @Override
    public StaggeredAdatper.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        mInflater = LayoutInflater.from(parent.getContext());

        View view=mInflater.inflate(R.layout.item,parent,false);

        return new ViewHolder(view);
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);

            textView= (TextView) itemView.findViewById(R.id.text);
        }
    }

}
