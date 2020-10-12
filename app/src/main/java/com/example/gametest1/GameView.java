package com.example.gametest1;

import android.content.Context;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable
{
    private Thread thread;
    private boolean isplaying;

    public GameView(Context context)
    {
        super(context);
    }

    @Override
    public void run()
    {
        while(isplaying)
        {
            update();
            draw();
            sleep();
        }
    }

    private void update()
    {

    }

    private void draw()
    {

    }

    private void sleep()
    {
        try {
            Thread.sleep(17)
            ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume()
    {
        isplaying = true;
        thread = new Thread(this);
        thread.start();

    }

    public void pause()
    {
        try {
            isplaying = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
