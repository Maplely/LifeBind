package top.com.myapplication.lifecycle;

import android.support.v4.app.FragmentManager;

/**
 * Created by top2011 on 2018/6/27.
 */

public class LifeCycleManager {
    public static void bindLifeCycle(FragmentManager manager,LifeCycleListener listener){
        LifeCycleFragment cycleFragment = (LifeCycleFragment) manager.findFragmentByTag(LifeCycleFragment.class.getName());
        if(cycleFragment==null) {
            cycleFragment = new LifeCycleFragment();
            cycleFragment.setOnListener(listener);
        }
        manager.beginTransaction().add(cycleFragment,LifeCycleFragment.class.getName()).commitAllowingStateLoss();
    }

}
