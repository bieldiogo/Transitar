package gabriel.com.transitar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by GabrielDiogo on 30/06/2015.
 */
public class Splash extends Activity implements Runnable {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        // tempo 3 segundos
        Handler handler = new Handler();
        handler.postDelayed(this, 3000);
    }

    // apos o carregamento encerra e abre o aplicativo
    public void run() {
        startActivity(new Intent(this, TelaPrincipal.class));
        finish();
    }
}
