package com.example.coolmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.elements);


        CheckBox checkBox1 = findViewById(R.id.CB1);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });

        CheckBox checkBox2 = findViewById(R.id.CB2);
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });

        CheckBox checkBox3 = findViewById(R.id.CB3);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });

        CheckBox checkBox4 = findViewById(R.id.CB4);
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });

        CheckBox checkBox5 = findViewById(R.id.CB5);
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            }
        });


        RadioGroup radioGroup = findViewById(R.id.RG);
        RadioButton radioButton1 = findViewById(R.id.RB1);
        RadioButton radioButton2 = findViewById(R.id.RB2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            }
        });
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (R.id.RB1 == checkedId) {
//                    str += "С пакетом\n";
//                }
//                if (R.id.RB2 == checkedId) {
//                    str += "Без пакета\n";
//                }
//            }
//        });

        EditText editText = findViewById(R.id.ET);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("TEXTCHANGED" + " BEFORE", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //str += editText.getText().toString();
                Log.d("TEXTCHANGED" + " ON", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //str += editText.getText().toString();
                Log.d("TEXTCHANGED" + " AFTER", s.toString());
            }
        });

        Bundle bundle = new Bundle();
        Button button = findViewById(R.id.B);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += "Вы выбрали:\n";
                if (checkBox1.isChecked()) {
                    str += checkBox1.getText().toString() + "\n";
                }
                if (checkBox2.isChecked()) {
                    str += checkBox2.getText().toString() + "\n";
                }
                if (checkBox3.isChecked()) {
                    str += checkBox3.getText().toString() + "\n";
                }
                if (checkBox4.isChecked()) {
                    str += checkBox4.getText().toString() + "\n";
                }
                if (checkBox5.isChecked()) {
                    str += checkBox5.getText().toString() + "\n";
                }
                str += "Способ доставки:\n";
                if (radioButton1.isChecked()) {
                    str += "Самовывоз\n";
                }
                if (radioButton2.isChecked()) {
                    str += "Курьером\n";
                }
                str += "Комментарий к заказу:\n";
                str += editText.getText().toString();
                CustomDialogFragment dialog = new CustomDialogFragment();
                bundle.putString("Arguments", str);
                dialog.setArguments(bundle);
                dialog.show(getSupportFragmentManager(), "custom");
                str = "";
            }
        });
    }

}