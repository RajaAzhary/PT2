package org.d3if3151.pt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        // Retrieve the answers passed from TestActivity
        Intent intent = getIntent();
        String answer1 = intent.getStringExtra("answer1");
        String answer2 = intent.getStringExtra("answer2");
        String answer3 = intent.getStringExtra("answer3");
        String answer4 = intent.getStringExtra("answer4");
        String answer5 = intent.getStringExtra("answer5");

        // Create TextViews to display the answers
        TextView textView1 = new TextView(this);
        textView1.setText("Kondisi: " + answer1);
        linearLayout.addView(textView1);

        TextView textView2 = new TextView(this);
        textView2.setText("Kualitas Tidur: " + answer2);
        linearLayout.addView(textView2);

        TextView textView3 = new TextView(this);
        textView3.setText("Makan: " + answer3);
        linearLayout.addView(textView3);

        TextView textView4 = new TextView(this);
        textView4.setText("Minum: " + answer4);
        linearLayout.addView(textView4);

        TextView textView5 = new TextView(this);
        textView5.setText("Olahraga: " + answer5);
        linearLayout.addView(textView5);

        Button BackLabTest = findViewById(R.id.exitResult);
        BackLabTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestResultActivity.this,HomeActivity.class));
            }
        });

        Button NextFC = findViewById(R.id.buttonResultFC);
        NextFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestResultActivity.this,FindDoctorActivity.class));
            }
        });
    }
}