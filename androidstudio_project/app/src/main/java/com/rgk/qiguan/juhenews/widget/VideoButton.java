package com.rgk.qiguan.juhenews.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Company    : RGK
 * Author     : qi.guan
 * Date       : 2017/11/8 11:29
 */

public class VideoButton extends View {

    private int width;
    private int height;
    private Point point1;
    private Point point2;
    private Point point3;
    private Path mPath;
    private Paint mPaint;

    public VideoButton(Context context) {
        super(context);
        init();
    }

    public VideoButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VideoButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    
    private void init(){
        mPath = new Path();
        mPaint = new Paint();

        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(3f);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();

        point1 = new Point(0, 0);
        point2 = new Point(0, height);
        point3 = new Point(width, height / 2);

        mPath.reset();

        mPath.moveTo(point1.x,point1.y);
        mPath.lineTo(point2.x,point2.y);
        mPath.lineTo(point3.x,point3.y);
        mPath.lineTo(point1.x,point1.y);
        mPath.close();
    }
}
