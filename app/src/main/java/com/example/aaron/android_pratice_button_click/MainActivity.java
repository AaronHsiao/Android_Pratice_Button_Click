package com.example.aaron.android_pratice_button_click;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    TextView tv_Show;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Show = (TextView) findViewById(R.id.tv_Show);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new Inner());
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

    @Override
    public void onClick(View view) {
        tv_Show.setText("我是Button Three!!!");
    }

    class Inner implements OnClickListener{
        @Override
        public void onClick(View view) {
            tv_Show.setText("Btn4 to demonstrate Inner Class");
        }
    }
}
