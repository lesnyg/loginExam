package com.example.user.loginexam;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginputActivity extends AppCompatActivity implements View.OnClickListener {


    public static final int REQUEST_CODE = 1000;
    private EditText mIdEditText;
    private EditText mPasswordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginput);

        mIdEditText = findViewById(R.id.id_edit);
        mPasswordEditText = findViewById(R.id.password_edit);

        findViewById(R.id.login_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent  = new Intent(this,loginoutputActivity.class);
        intent.putExtra("id",mIdEditText.getText().toString());
        intent.putExtra("password",mPasswordEditText.getText().toString());

        startActivityForResult(intent, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK && data !=null){
            String text = data.getStringExtra("result");
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }
}


