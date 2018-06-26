package top.com.myapplication.lifecycle;

/**
 * Created by top2011 on 2018/6/27.
 */

public interface LifeCycleListener {
    void onCreated();
    void onStart();
    void onResume();
    void onPaused();
    void onStoped();
    void onDestroyed();
}
