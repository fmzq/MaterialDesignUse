package com.joken.materialdesignuse.view.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.joken.materialdesignuse.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class PicActivity extends SwipeBackActivity {

    @BindView(R.id.text_view)
    TextView textView;
    @BindView(R.id.seek_bar)
    SeekBar seekBar;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.activity_main)
    FrameLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        ButterKnife.bind(this);
        ImmersionBar.with(this)
                .titleBar(toolbar)
                .transparentBar()
                .init();
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float alpha = (float) progress / 100;
                textView.setText("透明度:" + alpha + "f");
                ImmersionBar.with(PicActivity.this)
                        .addViewSupportTransformColor(toolbar,R.color.colorPrimary)
                        .navigationBarColorTransform(R.color.orange)
                        .barAlpha(alpha)
                        .init();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImmersionBar.with(this).destroy();
    }
}
