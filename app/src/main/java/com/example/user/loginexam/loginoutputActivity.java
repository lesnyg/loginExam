package com.example.user.loginexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class loginoutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginoutput);

        if(getIntent() != null){
            String id = getIntent().getStringExtra("id");
            String password = getIntent().getStringExtra("password");

            Toast.makeText(this, "id = "+id+", pw = "+password, Toast.LENGTH_SHORT).show();

        }
    }


    public void onClick(View view) {
        String text = ((Button)view).getText().toString();

        Intent intent = new Intent();
        intent.putExtra("result",text);
        setResult(RESULT_OK,intent);
        finish();
    }
}
