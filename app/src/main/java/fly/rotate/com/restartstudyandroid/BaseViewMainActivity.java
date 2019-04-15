package fly.rotate.com.restartstudyandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import fly.rotate.com.restartstudyandroid.common.BaseActivity;
import fly.rotate.com.restartstudyandroid.view.TextViewActivity;

/**
 * @author hzs
 * date: 2019/4/12
 */
public class BaseViewMainActivity extends BaseActivity implements View.OnClickListener {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView = (TextView) findViewById(R.id.text_view);

        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_view:
                startActivity(new Intent(this, TextViewActivity.class));
                break;
            default:
                break;
        }
    }
}
