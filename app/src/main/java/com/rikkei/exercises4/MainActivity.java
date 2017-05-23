package com.rikkei.exercises4;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mTextView = (TextView) findViewById(R.id.tvText);
        Button btHello = (Button) findViewById(R.id.btHello);
        Button btBye = (Button) findViewById(R.id.btBye);
        btBye.setOnClickListener(new TextSetter(String.valueOf(R.string.goodbye)));
        btHello.setOnClickListener(new TextSetter(String.valueOf(R.string.hello)));
    }

    private class TextSetter implements View.OnClickListener{
        private String mText;
        public TextSetter(String text){
            mText = text;
        }
        @Override
        public void onClick(View v) {
            mTextView.setText(mText);
            Toast.makeText(MainActivity.this, mText, Toast.LENGTH_LONG).show();
        }
    }

}


