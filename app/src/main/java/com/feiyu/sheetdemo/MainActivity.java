package com.feiyu.sheetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.feiyu.bottomsheetdialog.FullSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    private FullSheetDialogFragment fullSheetDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.txt_aaa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (null == fullSheetDialogFragment)
                    fullSheetDialogFragment = new FullSheetDialogFragment();

                fullSheetDialogFragment.show(getSupportFragmentManager(), "dialog");
            }
        });
    }
}
