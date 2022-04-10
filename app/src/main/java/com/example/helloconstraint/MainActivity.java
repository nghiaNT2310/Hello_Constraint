package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView showCount;
    private Button btZero;
    private Button btCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount=(TextView) findViewById(R.id.show_count);
        btZero=(Button) findViewById(R.id.button_zero);
        btCount=(Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mCount==1){
            btZero.setBackgroundColor(Color.YELLOW);
        }
        if(showCount!=null){
            showCount.setText(Integer.toString(mCount));
            if(mCount%2!=0){
                view.setBackgroundColor(Color.RED);
            }else{
                view.setBackgroundColor(Color.BLUE);
            }
        }
    }

    public void resetShowCount(View view) {
        mCount=0;

        if(showCount!=null){
            showCount.setText(Integer.toString(mCount));
            btZero.setBackgroundColor(Color.GRAY);
            btCount.setBackgroundColor(Color.BLUE);
        }
    }
}