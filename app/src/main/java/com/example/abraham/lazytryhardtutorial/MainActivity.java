package com.example.abraham.lazytryhardtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAdd, btnSub;

    TextView lblNum2, lblNum1, lblAnswer;
    double dNum1, dNum2, dAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("MVC");
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        lblNum1 = (TextView) findViewById(R.id.lblNum1);
        lblNum2 = (TextView) findViewById(R.id.lblNum2);
        lblAnswer = (TextView) findViewById(R.id.lblAnswer);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1.getText().toString());
                dNum2 = Double.parseDouble(lblNum2.getText().toString());
                dAnswer = dNum1 + dNum2;
                lblAnswer.setText(Double.toString(dAnswer));


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dNum1 = Double.parseDouble(lblNum1.getText().toString());
                dNum2 = Double.parseDouble(lblNum2.getText().toString());
                dAnswer = dNum1 - dNum2;
                lblAnswer.setText(Double.toString(dAnswer));

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
