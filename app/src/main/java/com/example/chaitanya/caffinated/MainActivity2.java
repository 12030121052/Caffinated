package com.example.chaitanya.caffinated;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends ActionBarActivity
{
    Button button;
    TextView textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
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
