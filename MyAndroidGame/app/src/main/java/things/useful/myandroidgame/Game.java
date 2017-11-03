package things.useful.myandroidgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Ako se brise title action putem java koda, mora se to uraditi pre setovanja ContentView-a

        //brise titl na layout-u
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Setovanje na full screan
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(new GamePanel(this));

    }
}
