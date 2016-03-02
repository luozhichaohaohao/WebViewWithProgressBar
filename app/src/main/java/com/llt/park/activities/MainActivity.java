package com.llt.park.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by a on 2016/3/1.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView _text = new TextView(this);
        _text.setText("Text"+"branch_dev_lzc"+"fix some bug and make a tag");
        setContentView(_text);
    }
}
