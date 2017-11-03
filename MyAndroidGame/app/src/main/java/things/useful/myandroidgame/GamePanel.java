package things.useful.myandroidgame;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Nikola on 10/23/2017.
 */

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback {

    //Kreiranje konstruktora

    public GamePanel(Context context){
        super(context);

        getHolder().addCallback(this);

        setFocusable(true);
    }//kraj konstruktora

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
