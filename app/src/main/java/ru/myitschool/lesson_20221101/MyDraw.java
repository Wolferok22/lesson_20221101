package ru.myitschool.lesson_20221101;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MyDraw extends View
{
    ArrayList<Figure> figures = new ArrayList<>();

    public int figurecount = 0;

    public MyDraw(Context context)
    {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if (event.getAction() == MotionEvent.ACTION_MOVE)
        {
            addFigure((int)(event.getX()),(int)(event.getY()));
        }
        else
        if(event.getAction() == MotionEvent.ACTION_UP)    {
            figures.clear();
        }

        return true;
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (int i = 0; i < figures.size(); i++)
        {
            if (figures.get(i) == null) continue;
            else figures.get(i).Draw(canvas);
        }
        invalidate();
    }

    void addFigure(int x, int y)
    {
        figurecount++;
        int type = (int) (Math.random() * 4);
        //Figure figure = getFigure(type, x, y);
        Figure figure = getFigure( 3,x,y);
        figures.add(figure);


    }

    private Figure getFigure(int type, int x, int y)
    {
        int[] colors = {Color.GREEN, Color.RED, Color.BLUE, Color.YELLOW};
        int color = colors[(int) (Math.random() * colors.length)];
        switch (type)
        {
            case 0:
                return new Circle(x, y, color);
            case 1:
                return new Rectangle(x, y, color);
            case 2:
                return new Circle(x, y, color, 50);
            case 3:
                return new Home(x, y, color, 50);
            default:
                return new Figure(x, y, color);
        }

    }
}
