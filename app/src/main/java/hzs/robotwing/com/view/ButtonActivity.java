package hzs.robotwing.com.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.*;
import hzs.robotwing.com.R;

/**
 * @author hzs
 * <p>
 * <p>
 * <p>
 * Switch控件：
 * * @attr ref android.R.styleable#Switch_textOn
 * * @attr ref android.R.styleable#Switch_textOff
 * * @attr ref android.R.styleable#Switch_switchMinWidth
 * * @attr ref android.R.styleable#Switch_switchPadding
 * * @attr ref android.R.styleable#Switch_switchTextAppearance
 * * @attr ref android.R.styleable#Switch_thumb  滑块的Drawable
 * * @attr ref android.R.styleable#Switch_thumbTextPadding
 * * @attr ref android.R.styleable#Switch_track   底部的Drawable
 * <p>
 * Switch控件在不同系统手机上是样式差异较大，一般使用自定义的SwitchButton控件
 */
public class ButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radio0;
    private RadioButton radio1;
    private RadioButton radio2;
    private CheckBox checkbox0;
    private CheckBox checkbox1;
    private ToggleButton toggleBtn;
    private ToggleButton toggleBtn1;
    private ToggleButton toggleBtn2;
    private Switch switch0;
    private Switch switch1;
    private Switch switch2;
    private Switch switch3;
    private Switch switch4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        initView();
        initEvent();
    }

    private void initView() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radio0 = (RadioButton) findViewById(R.id.radio0);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        checkbox0 = (CheckBox) findViewById(R.id.checkbox0);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        toggleBtn = (ToggleButton) findViewById(R.id.toggle_btn);
        toggleBtn1 = (ToggleButton) findViewById(R.id.toggle_btn1);
        toggleBtn2 = (ToggleButton) findViewById(R.id.toggle_btn2);
        switch0 = (Switch) findViewById(R.id.switch_0);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);
        switch3 = (Switch) findViewById(R.id.switch3);
        switch4 = (Switch) findViewById(R.id.switch4);
    }


    private void initEvent() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio0:
                        Log.d("onCheckedChanged", radio0.getText().toString());
                        break;
                    case R.id.radio1:
                        Log.d("onCheckedChanged", radio1.getText().toString());
                        break;
                    case R.id.radio2:
                        Log.d("onCheckedChanged", radio2.getText().toString());
                        break;
                    default:
                        break;
                }
            }
        });

        radio0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "radio0----" + isChecked + "");
            }
        });
        radio1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "radio1----" + isChecked + "");
            }
        });
        radio2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "radio2----" + isChecked + "");
            }
        });
        checkbox0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "checkbox0----" + isChecked + "");
            }
        });
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "checkbox1----" + isChecked + "");
            }
        });

        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "toggleBtn----" + isChecked + "");
            }
        });
        switch0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.d("onCheckedChanged", "switch0----" + isChecked + "");
            }
        });
    }

}
