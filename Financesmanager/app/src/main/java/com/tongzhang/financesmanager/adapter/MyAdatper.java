package com.tongzhang.financesmanager.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View.OnLongClickListener;

import com.tongzhang.financesmanager.R;

import java.util.List;

/**
 * Created by zt041 on 2017-03-29.
 */

public class MyAdatper extends RecyclerView.Adapter<MyAdatper.ViewHolder>{

    public  LayoutInflater inflater;
    private List<String> mDatas;


    public interface OnItemClickListener
    {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.mOnItemClickListener=listener;
    }
    public MyAdatper(List<String> datas) {

        this.mDatas = datas;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);

    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.textView.setText(mDatas.get(position));

        if(mOnItemClickListener!=null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClick(holder.itemView, position);
                }
            });


            //longclick
            holder.itemView.setOnLongClickListener(new OnLongClickListener(){
                @Override
                public boolean onLongClick(View v) {
                    mOnItemClickListener.onItemLongClick(holder.itemView,position);
                    return false;
                }
            });
        }


    }


    @Override
    public int getItemCount() {

        return mDatas.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public ViewHolder(View itemView) {

            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text);

        }
    }

}
