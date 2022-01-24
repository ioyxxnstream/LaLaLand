 package com.example.la;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     int[] ImageId = {R.drawable.volume, R.drawable.mute};
     ImageView MuteBtn;
     LinearLayout Content;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);
         setContentView(R.layout.activity_main);

         MuteBtn = (ImageView) findViewById(R.id.voice);
         Content = (LinearLayout)findViewById(R.id.content);

         MuteBtn.setImageResource(R.drawable.volume);

         MuteBtn.setOnClickListener(new ChangeListener());
         Content.setOnLongClickListener(new LongListener());

     }// end onCreate

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
             Intent intent = new Intent(getApplicationContext(), ListActivity.class);
             startActivity(intent);
             return true;

         }//end onLongClick
     }//end LongListener()


}// end Class



