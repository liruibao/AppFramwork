package com.ssoft.module_main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ssoft.library_base.RouterKeys;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = RouterKeys.MAIN_ACTIVITY)
public class MainActivity extends Activity {

    @BindView(R2.id.img_test) ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        ButterKnife.bind(this);
        imageView.setBackgroundResource(R.mipmap.ic_launcher);

    }
}
