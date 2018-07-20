package com.xq.mymaterialdesign.toolbar;

import android.os.Bundle;

import com.xq.mymaterialdesign.R;

public class ToolbarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentLayout(R.layout.tool_bar_layout);
        setTitle("我是一个标题");
        setBackArrow();

    }
}
