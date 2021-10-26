package ca.sz.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CrossFadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fade);

    }

    @Override
    protected void onPause() {
        super.onPause();

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_in);
    }
}