package hzs.robotwing.com.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import hzs.robotwing.com.R;

/**
 * @author hzs
 *
 *
 *
 * Switch控件：
 *  * @attr ref android.R.styleable#Switch_textOn
 *  * @attr ref android.R.styleable#Switch_textOff
 *  * @attr ref android.R.styleable#Switch_switchMinWidth
 *  * @attr ref android.R.styleable#Switch_switchPadding
 *  * @attr ref android.R.styleable#Switch_switchTextAppearance
 *  * @attr ref android.R.styleable#Switch_thumb  滑块的Drawable
 *  * @attr ref android.R.styleable#Switch_thumbTextPadding
 *  * @attr ref android.R.styleable#Switch_track   底部的Drawable
 *
 *
 *
 *
 *
 *
 *
 */
public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
}
