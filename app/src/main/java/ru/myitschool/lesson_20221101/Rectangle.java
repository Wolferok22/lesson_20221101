package ru.myitschool.lesson_20221101;

import android.graphics.Canvas;

public class Rectangle extends Figure
{
    public float scale;

    public Rectangle(int x, int y, int color, float scale)
    {
        super(x, y, color);
        this.scale = scale;
    }

    public Rectangle(int x,int y, int color)
    {
        this(x,y,color,20);
    }


    @Override
    public void Draw(Canvas canvas)
    {

        canvas.drawRect(getX() - scale,
                getY() - scale,
                getX() + scale,
                getY() + scale,
                paint);
    }
}
