package ru.myitschool.lesson_20221101;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Figure extends Point
{
    public int color;
    Paint paint;

    public Figure(int x, int y, int color)
    {
        super(x, y);
//        this.color = color;
        paint = new Paint();
        paint.setColor(color);
    }

    public void Draw(Canvas canvas)
    {

    }
}
