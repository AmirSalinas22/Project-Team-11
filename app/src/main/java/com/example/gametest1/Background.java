package com.example.gametest1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background
{
    int x, y;
    Bitmap background;

    Background(int screenX, int screenY, Resources res)
    {
        background = BitmapFactory.decodeResource(res, R.drawable.ic_launcher_background);
        background = Bitmap.createScaledBitmap(background, screenX, screenY, false);
    }
}
