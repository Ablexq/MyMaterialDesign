package com.xq.mymaterialdesign.coordinate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import com.xq.mymaterialdesign.R;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        findViewById(R.id.btn).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
                    view.setX(motionEvent.getRawX() - view.getWidth() / 2);
                    view.setY(motionEvent.getRawY() - view.getHeight() / 2);
                }
                return true;
            }
        });
    }

}
/*

为 CoordinatorLayout 的子 View 设置交互行为只需三步：

自定义一个继承自 Behavior 类的交互行为类；

把观察者的 layout_behavior 属性设置为自定义行为类的类名；

重写 Behavior 类的相关方法来实现我们想要的交互行为。

 */