package com.sometri.vaccin;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sometri.vaccin.database.DatabaseHelper;
import com.sometri.vaccin.models.Child;
import com.sometri.vaccin.models.VaccinationRecord;
import com.sometri.vaccin.models.Vaccine;

import java.util.List;

public class RecordVaccinationActivity extends AppCompatActivity {

    private Spinner spinnerChildren;
    private Spinner spinnerVaccines;
    private EditText etInjectionDate;
    private EditText etNextFollowupDate;
    private Button btnSaveVaccination;

    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_vaccination);

        spinnerChildren = findViewById(R.id.spinnerChildren);
        spinnerVaccines = findViewById(R.id.spinnerVaccines);
        etInjectionDate = findViewById(R.id.etInjectionDate);
        etNextFollowupDate = findViewById(R.id.etNextFollowupDate);
        btnSaveVaccination = findViewById(R.id.btnSaveVaccination);

        db = new DatabaseHelper(this);
        List<Child> children = db.getAllChildren();
        List<Vaccine> vaccines = db.getAllVaccines();

        ArrayAdapter<Child> childAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, children);
        spinnerChildren.setAdapter(childAdapter);

        ArrayAdapter<Vaccine> vaccineAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, vaccines);
        spinnerVaccines.setAdapter(vaccineAdapter);

        btnSaveVaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int childId = (int) spinnerChildren.getSelectedItemId(); // Example conversion
                int vaccineId = (int) spinnerVaccines.getSelectedItemId(); // Example conversion

                String injectionDate = etInjectionDate.getText().toString();
                String nextFollowupDate = etNextFollowupDate.getText().toString();

                if (!injectionDate.isEmpty() && !nextFollowupDate.isEmpty()) {
                    VaccinationRecord record = new VaccinationRecord(0, childId, vaccineId, injectionDate, nextFollowupDate);
                    db.addVaccinationRecord(record);
                    Toast.makeText(RecordVaccinationActivity.this, "Vaccination recorded successfully", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(RecordVaccinationActivity.this, "Please enter all details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}