package com.sometri.vaccin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sometri.vaccin.database.DatabaseHelper;
import com.sometri.vaccin.models.Vaccine;

public class RecordVaccineActivity extends AppCompatActivity {
    EditText etName, etDes, etMonthDue;
    Button bSave;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_vaccine);

        etName = findViewById(R.id.etVaccineName);
        etDes = findViewById(R.id.etDescription);
        etMonthDue = findViewById(R.id.etMonthDue);
        bSave = findViewById(R.id.btnSaveVaccine);

        db = new DatabaseHelper(this);

        bSave.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String des = etDes.getText().toString();
            int monthDue = Integer.parseInt(etMonthDue.getText().toString());
            if (name.isEmpty() || des.isEmpty()) {
                Toast.makeText(RecordVaccineActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Vaccine vaccine = new Vaccine(0, name, des, monthDue);
                db.addVaccine(vaccine);

                Toast.makeText(RecordVaccineActivity.this, "Vaccine recorded successfully", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }
}