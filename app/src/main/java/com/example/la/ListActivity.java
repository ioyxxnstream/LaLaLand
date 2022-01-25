package com.example.la;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    int[] ImageId = {R.drawable.volume, R.drawable.mute};
    ImageView MuteBtn;
    TextView Word1;
    TextView Word2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_list);

        MuteBtn = (ImageView) findViewById(R.id.voice);
        Word1 = (TextView)findViewById(R.id.word1);
        Word2 = (TextView)findViewById(R.id.word2);

        MuteBtn.setImageResource(R.drawable.volume);

        MuteBtn.setOnClickListener(new ListActivity.ChangeListener());
        Word1.setOnLongClickListener(new ListActivity.LongListener());

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


        class LongListener implements View.OnLongClickListener {
            @Override
            public boolean onLongClick(View v){
                Intent intent = new Intent(getApplicationContext(), LearningActivity.class);
                startActivity(intent);
                return true;

            }//end onLongClick
        }//end LongListener()

    }