package hzs.robotwing.com.view;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import hzs.robotwing.com.R;

/**
 * @author hzs
 * date: 2019/4/15
 * Chronometer
 * <p>
 * TimePicker
 * NumberPicker
 * DataPicker
 */
public class PickerActivity extends AppCompatActivity {

    Chronometer ch ;
    Button start ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
//        获取计时器组件
        ch=(Chronometer)findViewById(R.id.chronometer);
//        ch.setFormat("SS");//无效
        ch.setFormat("%s");//使用系统默认即小时内 MM:SS 超过1小时 H:MM:SS

//        获取开始组件
        start = (Button)findViewById(R.id.button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置开始计时时间
                ch.setBase(SystemClock.elapsedRealtime());
                //启动计时器
                ch.start();
            }
        });
        //为计时器绑定监听事件
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener()
        {
            @Override
            public void onChronometerTick(Chronometer ch)
            {
                // 如果从开始计时到现在超过了60s
                if (SystemClock.elapsedRealtime() - ch.getBase() > 60 * 1000)
                {
                    ch.stop();
                    start.setEnabled(true);
                }
            }
        });
    }
}
