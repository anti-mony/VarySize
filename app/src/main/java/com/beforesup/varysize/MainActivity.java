package com.beforesup.varysize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
                if (size < 85) {
                    size += 5;
                    hY.setTextSize(size);
                } else
                    Toast.makeText(getApplicationContext(), "Size Limit Reached", Toast.LENGTH_SHORT).show();
            }
        });
        dOWN.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View V) {
                size -= 5;
                hY.setTextSize(size);
            }
        });
    }
}

