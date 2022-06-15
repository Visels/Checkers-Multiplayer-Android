package com.main.checkers.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class BoardView  extends View {
    public BoardView(Context context) {
        super(context);
        init(null);
    }

    public BoardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public BoardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs,defStyleAttr);
        init(attrs);
    }

    public BoardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }




    private void init(@Nullable AttributeSet set){}


    private final float originX = 10f;
    private final float  originY = 200f;
    private final float cellSide = 200f;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        Paint paint = new Paint();

        for(int j = 0; j < 4; j++) {

            for (int i = 0; i < 4; i++) {
                paint.setColor(Color.LTGRAY);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas.drawRect(originX + 2 * i * cellSide, originY + 2 * j * cellSide, originX + (2 * i + 1) * cellSide, originY + (2 * j + 1) * cellSide, paint);
                canvas.drawRect(originX + (2 * i +1)* cellSide, originY + (2 * j+ 1)* cellSide, originX + (2 * i + 2) * cellSide, originY + (2 * j + 2) * cellSide, paint);

                paint.setColor(Color.DKGRAY);
                canvas.drawRect(originX + (2*i+1) * cellSide, originY + 2 * j * cellSide, originX + (2 * i + 2) * cellSide, originY + (2 * j + 1) * cellSide, paint);
                canvas.drawRect(originX + (2 * i) * cellSide, originY + (2 * j + 1) * cellSide, originX + (2*i + 1) * cellSide, originY + (2 * j + 2) * cellSide, paint);


            }
        }
    }

}

