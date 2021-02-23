package com.parceable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parceable.CustomObjects.UserData;

public class MainActivity extends AppCompatActivity {
    Button parcelDataSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViews();
        onClickListner();
    }

    private void intializeViews(){
        parcelDataSend=(Button)findViewById(R.id.Send_Parceable_data_button);
    }
    private void onClickListner(){
        parcelDataSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Frist way of passing Data.
                 */
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(getResources().getString(R.string.USER_DATA),new UserData("100","Vinay","Test"));
                startActivity(intent);

                /**
                 * Using Getters and Setters also we can pass the data.Pending try it Code tutor.
                 */
            }
        });
    }
}