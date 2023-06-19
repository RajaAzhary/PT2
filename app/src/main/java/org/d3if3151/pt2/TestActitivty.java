package org.d3if3151.pt2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TestActitivty extends AppCompatActivity {
    private RadioGroup choices1, choices2, choices3, choices4, choices5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button nextButton = findViewById(R.id.nextLT);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected answers
                int selectedId1 = choices1.getCheckedRadioButtonId();
                int selectedId2 = choices2.getCheckedRadioButtonId();
                int selectedId3 = choices3.getCheckedRadioButtonId();
                int selectedId4 = choices4.getCheckedRadioButtonId();
                int selectedId5 = choices5.getCheckedRadioButtonId();

                // Get the selected text of each answer
                RadioButton radioButton1 = findViewById(selectedId1);
                RadioButton radioButton2 = findViewById(selectedId2);
                RadioButton radioButton3 = findViewById(selectedId3);
                RadioButton radioButton4 = findViewById(selectedId4);
                RadioButton radioButton5 = findViewById(selectedId5);

                // Create an intent to pass data to TestResultActivity
                Intent intent = new Intent(TestActitivty.this, TestResultActivity.class);
                intent.putExtra("answer1", radioButton1.getText().toString());
                intent.putExtra("answer2", radioButton2.getText().toString());
                intent.putExtra("answer3", radioButton3.getText().toString());
                intent.putExtra("answer4", radioButton4.getText().toString());
                intent.putExtra("answer5", radioButton5.getText().toString());
                startActivity(intent);
            }
        });

        choices1 = findViewById(R.id.choices1);
        choices2 = findViewById(R.id.choices2);
        choices3 = findViewById(R.id.choices3);
        choices4 = findViewById(R.id.choices4);
        choices5 = findViewById(R.id.choices5);

        Button BackLabTest = findViewById(R.id.backLT);
        BackLabTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestActitivty.this,HomeActivity.class));
            }
        });

        Button NextLabTest = findViewById(R.id.nextLT);
        NextLabTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestActitivty.this,TestResultActivity.class));
            }
        });
    }
}