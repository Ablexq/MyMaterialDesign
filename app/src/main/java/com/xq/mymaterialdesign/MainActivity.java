package com.xq.mymaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xq.mymaterialdesign.cardview.CardViewActivity;
import com.xq.mymaterialdesign.coordinate.CoorAppBarActivity;
import com.xq.mymaterialdesign.coordinate.CoorAppBarActivity1;
import com.xq.mymaterialdesign.coordinate.BottomSheetBehaviorActivity;
import com.xq.mymaterialdesign.coordinate.CoorToolBarActivity;
import com.xq.mymaterialdesign.palette.PaletteActivity;
import com.xq.mymaterialdesign.coordinate.ScrollingActivity;
import com.xq.mymaterialdesign.toolbar.ToolbarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv1).setOnClickListener(this);
        findViewById(R.id.tv2).setOnClickListener(this);
        findViewById(R.id.tv3).setOnClickListener(this);
        findViewById(R.id.tv4).setOnClickListener(this);
        findViewById(R.id.tv5).setOnClickListener(this);
        findViewById(R.id.tv6).setOnClickListener(this);
        findViewById(R.id.tv7).setOnClickListener(this);
        findViewById(R.id.tv8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv1:
                startActivity(new Intent(MainActivity.this, CardViewActivity.class));
                break;
            case R.id.tv2:
                startActivity(new Intent(MainActivity.this, ToolbarActivity.class));
                break;
            case R.id.tv3:
                startActivity(new Intent(MainActivity.this, PaletteActivity.class));
                break;
            case R.id.tv4:
                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
                break;
            case R.id.tv5:
                startActivity(new Intent(MainActivity.this, CoorAppBarActivity1.class));
                break;
            case R.id.tv6:
                startActivity(new Intent(MainActivity.this, CoorToolBarActivity.class));
                break;
            case R.id.tv7:
                startActivity(new Intent(MainActivity.this, CoorAppBarActivity.class));
                break;
            case R.id.tv8:
                startActivity(new Intent(MainActivity.this, BottomSheetBehaviorActivity.class));
                break;
            default:
                break;
        }
    }
}
