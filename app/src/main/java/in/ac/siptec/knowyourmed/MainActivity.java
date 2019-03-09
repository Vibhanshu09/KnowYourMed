package in.ac.siptec.knowyourmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //splash screen display duration
    private static final int SPLASH_SCREEN_DISPLAY_TIME = 1500;

    LinearLayout splashTop, splashBottom;
    Animation upToDown, downToUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashTop = (LinearLayout) findViewById(R.id.splashTop);
        splashBottom = (LinearLayout) findViewById(R.id.splashBottom);
        upToDown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downToUp = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        splashTop.setAnimation(upToDown);
        splashBottom.setAnimation(downToUp);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent searchMedicineIntent = new Intent(SplashActivity.this,HomeActivity.class);
                //SplashActivity.this.startActivity(searchMedicineIntent);
                //SplashActivity.this.finish();
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            }
        },SPLASH_SCREEN_DISPLAY_TIME);
    }

}
