package ru.myitschool.lesson_20221101;

import android.graphics.Canvas;

public class Circle extends Figure
{
    public float radius;

    public Circle(int x, int y, int color, float radius)
    {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(int x,int y, int color)
    {
        this(x,y,color,20);
    }
    @Override
    public void Draw(Canvas canvas)
    {
        canvas.drawCircle(getX(),getY(),radius,paint);
    }
}

