package com.example.checkboxdemo;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.color.MaterialColors;

public class MainActivity extends AppCompatActivity {

    private TextView results;
    private CheckBox redSelection;
    private CheckBox blueSelection;
    private CheckBox greenSelection;
    private CheckBox blackSellection;
    private Button buttonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        results = findViewById(R.id.textViewID);
        redSelection = findViewById(R.id.redSel);
        blueSelection = findViewById(R.id.blueSel);
        greenSelection = findViewById(R.id.greenSel);
        blackSellection = findViewById(R.id.blackSel);
        buttonShow = findViewById(R.id.showBtn);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                results.setTextColor(Color.parseColor("#F44336"));
                if(redSelection.isChecked())
                    stringBuilder.append(redSelection.getText().toString()    +"\n");
                if(blueSelection.isChecked())
                    stringBuilder.append(blueSelection.getText().toString()   +"\n");
                if(greenSelection.isChecked())
                    stringBuilder.append(greenSelection.getText().toString()  +"\n");
                if(blackSellection.isChecked())
                    stringBuilder.append(blackSellection.getText().toString() +"\n");
                results.setText(stringBuilder );
            }//end of onClick()
        });//end of setOnClickListener()
    }//end of onCreate()
}//end class