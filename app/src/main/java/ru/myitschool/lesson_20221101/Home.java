package ru.myitschool.lesson_20221101;

import android.graphics.Canvas;
import android.graphics.Path;

public class Home extends Figure
{
    public int home;

    public Home(int x, int y, int color, int home)
    {
        super(x, y, color);
        this.home = home;
    }

    @Override
    public void Draw(Canvas canvas)
    {
        canvas.drawRect(getX()-home,
                getY()-home,
                getX()+home,
                getY()+home,
                paint);
        Path path = new Path();
        path.moveTo(getX()-home, getY()-home);
        path.lineTo(getX()-home+50,getY()-home-50);
        path.lineTo(getX()-home + 100,getY()-home);




        canvas.drawPath(path, paint);
    }
}
