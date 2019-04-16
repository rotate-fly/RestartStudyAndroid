package hzs.robotwing.com.view;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.*;
import hzs.robotwing.com.R;

/**
 * @author hzs
 * <p>
 *     Button 继承TextView
 *
 *        @Override
 *     public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
 *         if (getPointerIcon() == null && isClickable() && isEnabled()) {
 *             return PointerIcon.getSystemIcon(getContext(), PointerIcon.TYPE_HAND);
 *         }
 *         return super.onResolvePointerIcon(event, pointerIndex);
 *     }
 * Android 7.0 引入 Custom Pointer API，以便您可以自定义指针的外观、 可见性和行为。
 * 此功能在用户使用鼠标或触控板与 UI 对象交互尤为有用。默认指针使用标准图标。
 * 此 API 还包含多种高级功能，例如根据鼠标或触控板特定移动情况改变指针图标外观。
 * 要设置指针图标，请替换 View 类的 onResolvePointerIcon() 方法。
 * 此方法使用 PointerIcon 对象绘制与特定移动事件对应的图标。
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
 *
 * 常见问题
 * 1、防止按钮重复点击：https://blog.csdn.net/hust_twj/article/details/78742453
 *     时间使用SystemClock类 SystemClock.elapsedRealtime方法
 *
 */
public class ButtonActivity extends Activity {

    private Button btn;
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
        btn = findViewById(R.id.btn);
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            btn.setPointerIcon(PointerIcon.getSystemIcon(this,1000));
        }
        btn.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                            btn.onResolvePointerIcon(event,R.drawable.bg_switch_track_false);
                        }
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
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
