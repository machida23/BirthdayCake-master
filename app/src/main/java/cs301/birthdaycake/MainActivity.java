package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private CakeView cakeView;
    private CakeModel cakeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        // lab 3 checkpoint 1
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        // lab 3 checkpoint 2
        Button button = findViewById(R.id.button);
        button.setOnClickListener(cakeController);

        // lab 3 checkpoint 3
        Switch candles = (Switch)findViewById(R.id.Candles);
        candles.setOnCheckedChangeListener(cakeController);

        // lab 3 checkpoint 4
        SeekBar seekBar = findViewById(R.id.seekBar2);
        seekBar.setOnSeekBarChangeListener(cakeController);
    }

    // lab 2 checkpoint 4
    public void goodbye(View button) {
        System.out.println("goodbye");
    }
}
