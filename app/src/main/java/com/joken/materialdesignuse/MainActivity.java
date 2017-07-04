package com.joken.materialdesignuse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.joken.materialdesignuse.util.ToastUtil;
import com.joken.materialdesignuse.view.activity.PicActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_pic)
    Button btnPic;
    @BindView(R.id.ll_main)
    LinearLayout llMain;
    @BindView(R.id.btn_coordinator)
    Button btnCoordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_pic, R.id.btn_coordinator})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_pic:
                Intent intent = new Intent(this, PicActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_coordinator:
                ToastUtil.showToast("btn_coordinator");
                break;
        }
    }
}
