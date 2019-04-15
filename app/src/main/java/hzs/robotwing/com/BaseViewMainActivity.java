package hzs.robotwing.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import hzs.robotwing.com.common.BaseActivity;
import hzs.robotwing.com.view.ButtonActivity;
import hzs.robotwing.com.view.ClockActivity;
import hzs.robotwing.com.view.InputViewActivity;
import hzs.robotwing.com.view.TextViewActivity;

/**
 * @author hzs
 * date: 2019/4/12
 */
public class BaseViewMainActivity extends BaseActivity implements View.OnClickListener {
    private TextView textView;
    private TextView txtEditText;
    private TextView txtButton;
    private TextView txtClock;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView = (TextView) findViewById(R.id.text_view);
        txtEditText = (TextView) findViewById(R.id.txt_edit_text);
        txtButton = (TextView) findViewById(R.id.txt_button);
        txtClock = (TextView) findViewById(R.id.txt_clock);

        textView.setOnClickListener(this);
        txtEditText.setOnClickListener(this);
        txtButton.setOnClickListener(this);
        txtClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_view:
                startActivity(new Intent(this, TextViewActivity.class));
                break;
            case R.id.txt_edit_text:
                startActivity(new Intent(this, InputViewActivity.class));
                break;
            case R.id.txt_button:
                startActivity(new Intent(this, ButtonActivity.class));
                break;
            case R.id.txt_clock:
                startActivity(new Intent(this, ClockActivity.class));
                break;
            default:
                break;
        }
    }
}
