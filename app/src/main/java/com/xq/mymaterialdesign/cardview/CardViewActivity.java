package com.xq.mymaterialdesign.cardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.xq.mymaterialdesign.toolbar.BaseActivity;
import com.xq.mymaterialdesign.R;


public class CardViewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentLayout(R.layout.card_view_layout);
        setTitle("cardview演示");

        CardView cardView = (CardView) findViewById(R.id.cardView);
        cardView.setContentPadding(5, 5, 5, 5);//设置图片距离阴影大小
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CardViewActivity.this, "你点击了我", Toast.LENGTH_LONG).show();
            }
        });
    }
}
