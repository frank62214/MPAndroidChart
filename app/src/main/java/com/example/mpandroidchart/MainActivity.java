 package com.example.mpandroidchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    BarChart barChart;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = findViewById(R.id.Chart);

         List<BarEntry> entries = new ArrayList<>();
         entries.add(new BarEntry(0f, 30));
         entries.add(new BarEntry(1f, 80f));
         entries.add(new BarEntry(2f, 60f));
         entries.add(new BarEntry(3f, 50f));
         // gap of 2f
         entries.add(new BarEntry(4f, 70f));
         entries.add(new BarEntry(5f, 60f));

         BarDataSet set = new BarDataSet(entries, "BarDataSet");

         BarData data = new BarData(set);
         data.setBarWidth(0.5f); //設定自定義條形寬度
         barChart.setData(data);
         barChart.setFitBars(true); //使x軸完全適合所有條形
         barChart.invalidate(); // refresh
     }
}