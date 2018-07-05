package com.example.android.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button paulsButton = (Button)findViewById(R.id.paulsButton);
        paulsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView paulsText = (TextView)findViewById(R.id.paulsText);
                        paulsText.setText("You clicked the button");
                    }
                }
        );

        paulsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView paulsText = (TextView)findViewById(R.id.paulsText);
                        paulsText.setText("Dont hold the button");
                        return false;
                    }
                }
        );
    }
}
