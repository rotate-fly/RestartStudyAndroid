package fly.rotate.com.restartstudyandroid.view;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextView;
import fly.rotate.com.restartstudyandroid.R;

/**
 * @author hzs
 * date: 2019/4/12
 */
public class TextViewActivity extends Activity {

    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private SimpleMarqueeView txt6;
    private TextView txt31;
    private TextView txt32;
    private SimpleMarqueeView txt7;
    private TextView txt8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        initView();
        initEvent();
    }

    private void initView() {

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt31 = (TextView) findViewById(R.id.txt3_1);
        txt32 = (TextView) findViewById(R.id.txt3_2);
        txt4 = (TextView) findViewById(R.id.txt4);
        txt5 = (TextView) findViewById(R.id.txt5);
        txt6 = (SimpleMarqueeView) findViewById(R.id.txt6);
        txt7 = (SimpleMarqueeView) findViewById(R.id.txt7);
        txt8 = (TextView) findViewById(R.id.txt8);
    }

    private void initEvent() {

        //添加删除线
        txt1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        //在代码中设置加粗
        txt2.getPaint().setFlags(Paint.FAKE_BOLD_TEXT_FLAG);
        //添加下划线  当设置了文本大小时下划线失效，设置下划线还是使用UnderlineSpan类
        txt3.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        txt31.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        txt32.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);


        /**
         * 当只写了txt1-txt5时，如果只让txt4获取焦点
         * 即在xnl中加上
         *             android:focusable="true"
         *             android:focusableInTouchMode="true"
         *          txt4滚动
         * 当同时设置给txt1和txt4时只有txt1滚动
         * */
        txt4.setText("单行让文字可以水平滑动-1表示无限滚动");

        //单行
        txt4.setSingleLine(true);
        txt4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //让文字可以水平滑动
//        txt4.setHorizontallyScrolling(true);
        //-1表示无限滚动
        txt4.setMarqueeRepeatLimit(-1);

        /**
         * 使用了简单的自定义View，实现多个TextView都可以滚动，其他TextView无法获取焦点
         * */
        txt6.setText("为了实现多个TextView都可以滚动，进行简单的自定义View");
        txt6.setSingleLine(true);
        txt6.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //让文字可以水平滑动
//        txt4.setHorizontallyScrolling(true);
        //-1表示无限滚动
        txt6.setMarqueeRepeatLimit(-1);

        txt8.setText(Html.fromHtml(" <strong color='#D81B60'>通过Html类设置文本</strong>"));

    }

}
