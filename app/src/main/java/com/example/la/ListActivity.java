package com.example.la;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    int[] ImageId = {R.drawable.volume, R.drawable.mute};
    ImageView MuteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_list);

        MuteBtn = (ImageView) findViewById(R.id.voice);

        MuteBtn.setImageResource(R.drawable.volume);

        MuteBtn.setOnClickListener(new ListActivity.ChangeListener());

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