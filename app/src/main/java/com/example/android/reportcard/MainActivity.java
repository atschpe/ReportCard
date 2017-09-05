package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard("John", "sixth form", "1-", "2", "2+", "2", "2", "3",
                "2-3", "2+", "5", "3-", "1-", "1", "3+", "3-4", "2-3", "4", "2-3", "3", "2-", "1-2");

        String reportCardString = reportCard.toString();

        TextView textView = (TextView) findViewById(R.id.report_card);
        textView.setText(reportCardString);

    }
}
