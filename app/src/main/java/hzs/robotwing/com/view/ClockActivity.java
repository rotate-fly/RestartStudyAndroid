package hzs.robotwing.com.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextClock;
import hzs.robotwing.com.R;

/**
 * @author hzs
 * date: 2019/4/15
 * AnalogClock   已过时，且不再支持
 * *deprecated This widget is no longer supported.
 * <p>
 * TextClock
 * *@attr ref android.R.styleable#TextClock_format12Hour
 * * @attr ref android.R.styleable#TextClock_format24Hour
 * * @attr ref android.R.styleable#TextClock_timeZone
 * <p>
 * DigitalClock  已过时 建议使用TextClock
 * Like AnalogClock, but digital.  Shows seconds.
 * *
 * * *deprecated It is recommended you use {@link TextClock} instead.
 *
 *
 * Chronometer控件
 * Android CountDownTimer 倒计时器
 *
 */
public class ClockActivity extends AppCompatActivity {
    private TextClock textClock;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
    }
}
