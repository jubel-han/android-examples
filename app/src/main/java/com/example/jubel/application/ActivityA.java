package com.example.jubel.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jubel.myapplication.R;

public class ActivityA extends AppCompatActivity {
    static final int REQUEST_CODE = 1;
    // private Button m_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_main);
        /*
        m_btn = (Button) findViewById(R.id.mainBtn);
        m_btn.setOnClickListener(analyseCale);
        */
    }

    public void button(View view){
        Intent intent = new Intent(this,ActivityB.class);
        intent.putExtra("SEND_DATA", "Send Data To ActivityB");
        startActivityForResult(intent, REQUEST_CODE);
    }

    /*
    private Button.OnClickListener analyseCale = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ActivityA.this, ActivityB.class);
            Bundle bundle = new Bundle();
            bundle.putString("SEND_DATA", "Send Data To ActivityB");
            intent.putExtras(bundle);
            startActivityForResult(intent, REQUEST_CODE);
        }
    };
    */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();
                String returnData = bundle.getString("RETURN_DATA");
                Toast.makeText(ActivityA.this, returnData, Toast.LENGTH_LONG).show();
            }
        }
    }
}
