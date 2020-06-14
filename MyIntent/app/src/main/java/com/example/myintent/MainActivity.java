package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view){
        String no           = "085155317321";
        Intent call         = new Intent(Intent.ACTION_DIAL);

        call.setData(Uri.fromParts("tel", no, null));
        startActivity(call);
    }

    public void web(View view){
        String url          = "https://www.ayoboga.com";
        Intent openBrowser  = new Intent(Intent.ACTION_VIEW);

        openBrowser.setData(Uri. parse(url));
        startActivity(openBrowser);
    }
}