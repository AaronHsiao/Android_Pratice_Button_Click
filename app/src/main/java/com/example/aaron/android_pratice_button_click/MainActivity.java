package com.example.aaron.android_pratice_button_click;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Show = (TextView) findViewById(R.id.tv_Show);
    }

    public void btn_Click(View view)
    {
        int id = view.getId();

        if(id == R.id.btn1)
        {
            tv_Show.setText("我是Button One");
        }

        if(id == R.id.btn2)
        {
            tv_Show.setText("我是Button Two");
        }
    }
}
