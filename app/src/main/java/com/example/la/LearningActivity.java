package com.example.la;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LearningActivity extends AppCompatActivity {

    private static final String TAG = "codingrun.StateChange";
    int[] ImageId = {R.drawable.volume, R.drawable.mute};
    ImageView MuteBtn;
    int x, y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_learning);
        Log.i(TAG, "onCreate");


        MuteBtn = (ImageView) findViewById(R.id.voice);

        MuteBtn.setImageResource(R.drawable.volume);

        MuteBtn.setOnClickListener(new LearningActivity.ChangeListener());



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onCreate");
    }

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
}