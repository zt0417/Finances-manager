package com.tongzhang.financesmanager.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tongzhang.financesmanager.R;


/**
 * Created by zt041 on 2017-03-22.
 */
public class DetailFragment extends Fragment{


    private TextView mTv;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail,container,false);
    }

    //@Override
    public void init() {

    }
}

/*public class DetailFragment extends Fragment{

    private TextView mTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view=inflater.inflate(R.layout.fragment_detail,container,false);
        mTv = (TextView) view.findViewById(R.id.bt_main);
        helloEventBus();
        return view;
    }

    @Subscribe(threadMode = ThreadMode.MainThread)
    public void helloEventBus(String message){
        mText.setText(message);
    }


    //@Override
    public void init() {

    }

}*/
