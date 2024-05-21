package com.sometri.vaccin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegisterChild = findViewById(R.id.btnRegisterChild);
        Button btnRecordVaccination = findViewById(R.id.btnRecordVaccination);
        Button btnViewRecords = findViewById(R.id.btnViewRecords);
        Button bRecordVaccine = findViewById(R.id.btnRecordVaccine);

        btnRegisterChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterChildActivity.class);
                startActivity(intent);
            }
        });

        btnRecordVaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecordVaccinationActivity.class);
                startActivity(intent);
            }
        });

        btnViewRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewRecordsActivity.class);
                startActivity(intent);
            }
        });

        bRecordVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecordVaccineActivity.class);
                startActivity(intent);
            }
        });
    }
}