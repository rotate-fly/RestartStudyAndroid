package hzs.robotwing.com.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author hzs
 * date: 2019/4/12
 */
public class SimpleMarqueeView extends TextView {
    public SimpleMarqueeView(Context context) {
        super(context);
    }

    public SimpleMarqueeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleMarqueeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SimpleMarqueeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean isFocused() {
        return true;
//        return super.isFocused();
    }
}
