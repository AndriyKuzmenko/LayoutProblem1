package com.example.layoutproblem1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView myTextView;
    Random myRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView=(TextView)findViewById(R.id.textView);
        myRandom=new Random();
    }

    public void Clear(View view)
    {
        myTextView.setText("Number Not Found!");
    }

    public void createRandomNumber(View view)
    {
        myTextView.setText("Number="+String.valueOf(myRandom.nextInt()));
    }
}
