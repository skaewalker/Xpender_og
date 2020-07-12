package com.example.xpender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {
public Button move1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView text=(TextView)findViewById(R.id.wlcm2);
        move1=(Button)findViewById(R.id.start);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }

            public void openLogin() {
                Intent intent=new Intent(getApplicationContext(),login_page.class);
                startActivity(intent);
            }
        });

    }
}