package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class OnBoardActivity extends AppCompatActivity {
        private ViewPager pager;
        private ViewPagerAdapter adapter;
        private TextView txtSkip, txtNext;
        private DotsIndicator dotsIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        initPager();    }
    private void initPager() {
        pager = findViewById(R.id.vp_on_board);
        txtNext= findViewById(R.id.txt_next);
        txtSkip= findViewById(R.id.txt_skip);
        dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
        List<itemOnBoardFragment> fragments = new ArrayList<>();
        fragments.add(itemOnBoardFragment.newInstance("1st","1st"));
        fragments.add(itemOnBoardFragment.newInstance("2nd","2nd"));
        fragments.add(itemOnBoardFragment.newInstance("3rd","3rd"));
adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
pager.setAdapter(adapter);
        dotsIndicator.setViewPager(pager);
    }

}