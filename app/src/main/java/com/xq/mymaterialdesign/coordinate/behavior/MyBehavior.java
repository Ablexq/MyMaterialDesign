package com.xq.mymaterialdesign.coordinate.behavior;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/**
 * Created by lenovo on 2018/7/26.
 */

public class MyBehavior extends  CoordinatorLayout.Behavior<View> {

    // 决定child 依赖于把一个 dependency
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return super.layoutDependsOn(parent, child, dependency);//返回TRUE，将会调用onDependentViewChanged（）方法
    }

    // 当 dependency View 改变的时候 child 要做出怎样的响应
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        return super.onDependentViewChanged(parent, child, dependency);
    }

    /*=====================================================================================================*/

    // 当CoordinatorLayout的直接或者非直接子View开始嵌套滑动的时候，会调用这个方法
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    // 当嵌套滑动的时候，target 尝试滑动或者正在滑动会调用这个方法
    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

}
