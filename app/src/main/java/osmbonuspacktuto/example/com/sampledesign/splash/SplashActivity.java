package osmbonuspacktuto.example.com.sampledesign.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import osmbonuspacktuto.example.com.sampledesign.MainActivity;
import osmbonuspacktuto.example.com.sampledesign.R;
import osmbonuspacktuto.example.com.sampledesign.acceuil.Acceuil;

public class SplashActivity extends AppCompatActivity {

    private int TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Acceuil.class);
                startActivity(intent);
                finish();
            }
        },TIME_OUT);
    }
}
