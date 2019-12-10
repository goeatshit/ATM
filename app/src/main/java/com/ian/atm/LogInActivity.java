package com.ian.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    private static final String TAG = LogInActivity.class.getSimpleName();
    private TextView user;
    private TextView pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void login(View view) {
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        String us = user.getText().toString();
        String pas = pass.getText().toString();
        if("Tom".equals(us)&&"1234".equals(pas)){
            setResult(RESULT_OK);
            Log.d(TAG, "login");
            finish();

        }else{
            new AlertDialog.Builder(LogInActivity.this)
                    .setTitle("You got a message")
                    .setMessage("Login failed !")
                    .setPositiveButton("Fine",null)
                    .show();

        }

    }


}



