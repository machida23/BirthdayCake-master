package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
    private CakeView cakeView;
    private CakeModel cakeModel;

    // lab 3 checkpoint 1
    public CakeController(CakeView newCakeView) {
        cakeView = newCakeView;
        cakeModel = cakeView.getCakeModel();


    }

    // lab 3 checkpoint 2
    public void onClick (View v) {
        //System.out.println("on click");
        cakeModel.isLit = false;
        cakeView.invalidate();
    }

    // lab 3 checkpoint 3
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            cakeModel.hasCandles = isChecked;
            cakeView.invalidate();
        }

    // lab 3 checkpoint 4
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    // Lab 4 CP2
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if((motionEvent.getActionMasked()) == motionEvent.ACTION_DOWN) {
            cakeModel.touchX = (int) motionEvent.getX();
            cakeModel.touchY = (int) motionEvent.getY();
            cakeView.invalidate();
            cakeModel.hasTouched = true;
            return true;
       }

        return false;
    }
}
