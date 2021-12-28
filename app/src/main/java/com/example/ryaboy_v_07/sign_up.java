package com.example.ryaboy_v_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.RegBtn:
                Intent intent = new Intent(this, profile.class);
                startActivity(intent);
                break;
        }
    }
}