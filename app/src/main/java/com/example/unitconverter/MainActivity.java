package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import java.sql.Timestamp;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText fTempEditText;
    private EditText cTempEditText;
    private EditText kmEditText;
    private EditText MilesEditText;
    private EditText kgEditText;
    private EditText lbEditText;
    private EditText literEditText;
    private EditText gallonEditText;


    DecimalFormat standard = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fTempEditText = (EditText) this.findViewById(R.id.fTempEditText);
        cTempEditText = (EditText) this.findViewById(R.id.cTempEditText);
        kmEditText = (EditText) this.findViewById(R.id.kmEditText);
        MilesEditText = (EditText) this.findViewById(R.id.MilesEditText);
        kgEditText = (EditText) this.findViewById(R.id.kgEditText);
        lbEditText = (EditText) this.findViewById(R.id.lbEditText);
        literEditText = (EditText) this.findViewById(R.id.literEditText);
        gallonEditText = (EditText) this.findViewById(R.id.gallonEditText);

        fTempEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (fTempEditText.hasFocus()) {
                    try {
                        double fahrenheitNum = Double.parseDouble(fTempEditText.getText().toString());
                        double result = (fahrenheitNum - 32) * 5 / 9;
                        cTempEditText.setText(standard.format(result) + " °C");
                    } catch (Exception e) {
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
            Log.i(null,"°F Temp Converted" + "/ " + ts);
            }
        });
        cTempEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (cTempEditText.hasFocus()) {
                    try {
                        double celsiusNum = Double.parseDouble(cTempEditText.getText().toString());
                        double result = (celsiusNum * 9 / 5) + 32;
                        fTempEditText.setText(standard.format(result) + " °F");
                    }
                    catch(Exception e) {}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"°C Temp Converted" + "/ " + ts);
            }
        });

        kmEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (kmEditText.hasFocus()) {
                    try {
                        double kmNum = Double.parseDouble(kmEditText.getText().toString());
                        double result = kmNum * 0.62137;
                        MilesEditText.setText(standard.format(result) + " Miles");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Km Converted" + "/ " + ts);
            }
        });

        MilesEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (MilesEditText.hasFocus()) {
                    try {
                        double milesNum = Double.parseDouble(MilesEditText.getText().toString());
                        double result = milesNum * 1.609;
                        kmEditText.setText(standard.format(result) + " Kilometers");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Miles Converted" + "/ " + ts);
            }
        });

        kgEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (kgEditText.hasFocus()) {
                    try {
                        double kgNum = Double.parseDouble(kgEditText.getText().toString());
                        double result = kgNum * 2.205;
                        lbEditText.setText(standard.format(result) + " Pounds");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Kg converted" + "/ " + ts);
            }
        });

        lbEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (lbEditText.hasFocus()) {
                    try {
                        double lbNum = Double.parseDouble(lbEditText.getText().toString());
                        double result = lbNum / 2.205;
                        kgEditText.setText(standard.format(result) + " Kilograms");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Lbs Converted" + "/ " + ts);
            }
        });

        literEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (literEditText.hasFocus()) {
                    try {
                        double literNum = Double.parseDouble(literEditText.getText().toString());
                        double result = literNum / 3.785;
                        gallonEditText.setText(standard.format(result) + " Gallons");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Liters Converted " + "/ " + ts);
            }
        });

        gallonEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (gallonEditText.hasFocus()) {
                    try {
                        double gallonNum = Double.parseDouble(gallonEditText.getText().toString());
                        double result = gallonNum * 3.785;
                        literEditText.setText(standard.format(result) + " Liters");
                    }
                    catch(Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Long tsLong = System.currentTimeMillis()/1000;
                String ts = tsLong.toString();
                Log.i(null,"Gallons Converted" + "/ " + ts);
            }
        });
    }
}
