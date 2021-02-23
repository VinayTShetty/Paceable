package com.parceable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.parceable.CustomObjects.UserData;

public class SecondActivity extends AppCompatActivity {

    TextView userData_Information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intializeTextViews();
        getDataFromIntent();
    }

   private void getDataFromIntent(){
     UserData userData= getIntent().getParcelableExtra(getResources().getString(R.string.USER_DATA));
       userData_Information.setText(userData.getUserid()+"\n"+userData.getUserName()+"\n"+userData.getPassword());
   }
   private void intializeTextViews(){
       userData_Information=(TextView)findViewById(R.id.parceable_data_textview);
   }
}