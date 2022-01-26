package com.example.la;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.io.SequenceInputStream;
import java.text.AttributedCharacterIterator;

public class LearningActivity extends AppCompatActivity {

    private static final String TAG = "codingrun.StateChange";
    int[] ImageId = {R.drawable.volume, R.drawable.mute};
    ImageView MuteBtn;
    ScrollView Scroll;
    Button Day1;
    Button Day4;
    int x, y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_learning);
        Log.i(TAG, "onCreate");


        MuteBtn = (ImageView)findViewById(R.id.voice);
        Scroll = (ScrollView)findViewById(R.id.scroll);
        Day1 = (Button)findViewById(R.id.day1);
        Day4 = (Button)findViewById(R.id.day4);



        MuteBtn.setImageResource(R.drawable.volume);


        MuteBtn.setOnClickListener(new LearningActivity.ChangeListener());

        Day1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                Scroll.scrollTo(x = 0, y = Day4.getBottom());
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    /*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

        final ScrollView Scroll = (ScrollView) findViewById(R.id.scroll);
        SequenceInputStream S_Data =
    }

     */

    class ChangeListener implements View.OnClickListener {
        int i = 0;
        int len = ImageId.length;

        @Override
        public void onClick(View v) {
            MuteBtn.setImageResource(ImageId[i]);
            i += 1;
            if (i == len) i = 0;

        }//end onclick
    }//end ChangeListener()

    class cal_distance

    /*
    internal fun ScrollView.computeDistanceToView(view: View): Int {
        return abs(calculateRectOnScreen(this).top - (this.scrollY + calculateRectOnScreen(view).top))
    }

    internal fun calculateRectOnScreen(view: View): Rect {
        val location = IntArray(2)
        view.getLocationOnScreen(location)
        return Rect(
                location[0],
                location[1],
                location[0] + view.measuredWidth,
                location[1] + view.measuredHeight
        )
    }

     */

}


