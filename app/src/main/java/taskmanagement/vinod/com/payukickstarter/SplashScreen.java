package taskmanagement.vinod.com.payukickstarter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Vinod on 8/12/2017.
 */

public class SplashScreen extends ApplicationLayer implements HttpRequestHandler.HttpRequestComplete {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new HttpRequestHandler(SplashScreen.this).makeRequest();
    }

    @Override
    public void onHttpRequestComplete() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        // close this activity
        finish();
    }
}
