package com.kantwarahul.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DragLinearLayout dragLinearLayout = findViewById(R.id.layout_main);
        for (int i = 0; i < dragLinearLayout.getChildCount(); i++)
        {
            View child = dragLinearLayout.getChildAt(i);
            dragLinearLayout.setViewDraggable(child,child);
        }
    }
}