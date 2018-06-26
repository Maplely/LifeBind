package top.com.myapplication.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by top2011 on 2018/6/27.
 */

public class LifeCycleFragment extends Fragment {
    LifeCycleListener mlistener;

    public void setOnListener(LifeCycleListener mlifelistener){
        mlistener=mlifelistener;
    }

    @Override
    public void onStart() {
        super.onStart();
        if(null!=mlistener){
            mlistener.onStart();
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(null!=mlistener){
            mlistener.onCreated();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if(null!=mlistener){
            mlistener.onResume();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if(null!=mlistener){
            mlistener.onStoped();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(null!=mlistener){
            mlistener.onDestroyed();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(null!=mlistener){
            mlistener.onPaused();
        }
    }
}
