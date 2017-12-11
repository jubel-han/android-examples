package com.example.jubel.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.jubel.myapplication.R;

public class ActivityB extends AppCompatActivity {
    /*
    private Button m_btnback;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_main);

        /*
        m_btnback = (Button) findViewById(R.id.subBtn);
        m_btnback.setOnClickListener(returnDataCalc);
        */

        String receivedData = getIntent().getStringExtra("SEND_DATA");
        Toast.makeText(ActivityB.this, receivedData, Toast.LENGTH_LONG).show();
    }

    public void button(View view){
        Intent intent = new Intent(this,ActivityB.class);
        Bundle bundle = new Bundle();
        bundle.putString("RETURN_DATA", "Return Data To ActivityA");
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }

    /* // optional using the OnClickListener for the button
    private Button.OnClickListener returnDataCalc = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("RETURN_DATA", "Return Data To ActivityA");
            intent.putExtras(bundle);
            setResult(RESULT_OK, intent);
            finish();
        }
    };
    */

}
