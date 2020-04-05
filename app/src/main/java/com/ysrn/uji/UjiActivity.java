package com.ysrn.uji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class UjiActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uji);

        ImageButton btnimageButton1 = findViewById(R.id.btn_imageButton1);
        btnimageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageButton1Intent = new Intent(UjiActivity.this, IsiActivity.class);
                startActivity(imageButton1Intent);
                Toast.makeText(getApplicationContext(), "Pengertian COVID19/Corona", Toast.LENGTH_LONG).show();
            }
        });

        ImageButton btnimageButton2 = findViewById(R.id.btn_imageButton2);
        btnimageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageButton2Intent = new Intent(UjiActivity.this, Isi2Activity.class);
                startActivity(imageButton2Intent);
                Toast.makeText(getApplicationContext(), "Pencegahan COVID19/Corona", Toast.LENGTH_LONG).show();
            }
        });
        ImageButton btnimageButton3 = findViewById(R.id.btn_imageButton3);
        btnimageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageButton3Intent = new Intent(UjiActivity.this, Isi3Activity.class);
                startActivity(imageButton3Intent);
                Toast.makeText(getApplicationContext(), "Daftar Rumah Sakit COVID19/Corona ", Toast.LENGTH_LONG).show();
            }
        });
    }
}
