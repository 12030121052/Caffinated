package com.example.chaitanya.caffinated;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{
    Button button;
    TextView textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViews = (TextView) findViewById(R.id.textView);

        textViews.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    /*
    public void addListenerOnTextView()
    {
        final Context context = this;
        textViews = (TextView) findViewById(R.id.textView);
        textViews.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);
            }
        });
        textViews.setOnClickListener();
    }
*/
}
