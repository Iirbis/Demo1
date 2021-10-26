package ca.sz.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btCrossFade;
    Button btSlide;
    Button btViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCrossFade = findViewById(R.id.btNextCrossFade);
        btCrossFade.setOnClickListener(clickListener);

        btSlide = findViewById(R.id.btNextSlide);
        btSlide.setOnClickListener(clickListener);

        btViewPager = findViewById(R.id.btViewPager);
        btViewPager.setOnClickListener(clickListener);

    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (view.getId() == R.id.btNextCrossFade) {
                Intent intent = new Intent(MainActivity.this, CrossFadeActivity.class);
                startActivity(intent);

                //Setting the animation for the next activity
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_in);

            } else if (view.getId() == R.id.btNextSlide) {

                Intent intent = new Intent(MainActivity.this, SlideActivity.class);
                startActivity(intent);

                //Setting the animation for the next activity
                //overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }else if (view.getId() == R.id.btViewPager) {

                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);

            }
        };
    };
}