package com.example.layoutproblem1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView=(TextView)findViewById(R.id.textView);
    }

    public void Clear(View view)
    {
        myTextView.setText("Number Not Found!");
    }
}
