package com.xq.mymaterialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xq.mymaterialdesign.cardview.CardViewActivity;
import com.xq.mymaterialdesign.coordinate.CoorAppBarActivity;
import com.xq.mymaterialdesign.coordinate.CoorAppBarActivity1;
import com.xq.mymaterialdesign.coordinate.CoorToolBarActivity;
import com.xq.mymaterialdesign.palette.PaletteActivity;
import com.xq.mymaterialdesign.coordinate.ScrollingActivity;
import com.xq.mymaterialdesign.toolbar.ToolbarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv1;
    private TextView mTv2;
    private TextView mTv3;
    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv6;
    private TextView mTv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv1 = ((TextView) this.findViewById(R.id.tv1));
        mTv2 = ((TextView) this.findViewById(R.id.tv2));
        mTv3 = ((TextView) this.findViewById(R.id.tv3));
        mTv4 = ((TextView) this.findViewById(R.id.tv4));
        mTv5 = ((TextView) this.findViewById(R.id.tv5));
        mTv6 = ((TextView) this.findViewById(R.id.tv6));
        mTv7 = ((TextView) this.findViewById(R.id.tv7));
        mTv1.setOnClickListener(this);
        mTv2.setOnClickListener(this);
        mTv3.setOnClickListener(this);
        mTv4.setOnClickListener(this);
        mTv5.setOnClickListener(this);
        mTv6.setOnClickListener(this);
        mTv7.setOnClickListener(this);

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
            default:
                break;
        }
    }
}
