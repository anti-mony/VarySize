package com.beforesup.varysize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float size = 25;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button uP = (Button) findViewById(R.id.UP);
        Button dOWN = (Button) findViewById(R.id.DOWN);
        final EditText hY = (EditText) findViewById(R.id.HY);
        uP.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View V) {
                if(size!=85)
                    hY.setTextSize(size += 5);
                else
                    Toast.makeText(getApplicationContext(),"Max Size Reached",Toast.LENGTH_SHORT).show();
            }
        });
        dOWN.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View V) {
                hY.setTextSize(size -= 5);
            }
        });
    }
}

