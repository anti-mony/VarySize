package com.beforesup.varysize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    float size = 24;
    private GestureDetectorCompat GD;
    private EditText hY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button uP = (Button) findViewById(R.id.UP);
        Button dOWN = (Button) findViewById(R.id.DOWN);
        hY = (EditText) findViewById(R.id.HY);
        //Gestures
        this.GD = new GestureDetectorCompat(this,this);
        GD.setOnDoubleTapListener(this);
        //Gestures
        uP.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View V) {
                if (size < 80) {
                    size += 4;
                    hY.setTextSize(size);
                } else
                    Toast.makeText(getApplicationContext(), "Size Limit Reached", Toast.LENGTH_SHORT).show();
            }
        });
        uP.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String t = "Long Press Eh!";
                hY.setText(t);
                return true;
            }
        });

        dOWN.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View V) {
                size -= 4;
                hY.setTextSize(size);
            }
        });

    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if (size < 80) {
            size = (size+4)%80;
            hY.setTextSize(size);
        }
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.GD.onTouchEvent(event) ;
        return super.onTouchEvent(event);
    }
}

