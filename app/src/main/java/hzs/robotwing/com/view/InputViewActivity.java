package hzs.robotwing.com.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import hzs.robotwing.com.R;

/**
 * @author hzs
 */
public class InputViewActivity extends AppCompatActivity {

    private EditText et0;
    private EditText et1;
    private EditText et2;
    private EditText et3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        initView();
        initEvent();
    }



    private void initView() {
        et0 = (EditText) findViewById(R.id.et_0);
        et1 = (EditText) findViewById(R.id.et_1);
        et2 = (EditText) findViewById(R.id.et_2);
        et3 = (EditText) findViewById(R.id.et_3);
    }

    private void initEvent() {
        et0.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                //可通过actionId 判断是  android:imeOptions="actionNext" 属性设置的值
                //输入法中action按钮点击事件
                Log.d("edittext","onEditorAction");
                return false;
            }
        });

        et0.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Log.d("edittext","onFocusChange");
            }
        });
        et0.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.d("edittext","OnKeyListener");
                return false;
            }
        });
        et0.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edittext","beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edittext","onTextChanged");
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edittext","afterTextChanged");
            }
        });
    }

    private void showToast(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
