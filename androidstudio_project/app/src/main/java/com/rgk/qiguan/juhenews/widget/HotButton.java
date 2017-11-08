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
 * Date       : 2017/11/8 15:37
 */

public class HotButton extends View {

    private Path mPath;
    private Paint mPaint;
    private int width;
    private int height;
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private Point point5;
    private Point point6;
    private Point point7;
    private Point point8;
    private Point point9;
    private Point controlPoint1;
    private Point controlPoint2;
    private Point controlPoint3;
    private Point controlPoint4;

    public HotButton(Context context) {
        super(context);
        init();
    }

    public HotButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HotButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

        point1 = new Point(width / 14, height * 13 / 34);
        point2 = new Point(width * 7 / 28, height * 7 / 34);
        point3 = new Point(width * 5 / 14, height * 6 / 17);
        point4 = new Point(width / 2, 0);
        point5 = new Point(width * 9 / 14, height * 6 / 17);
        point6 = new Point(width * 21 / 28, height * 7 / 34);
        point7 = new Point(width * 13 / 14, height * 13 / 34);
        point8 = new Point(width * 13 / 14, height * 29 / 34);
        point9 = new Point(width / 14, height * 29 / 34);

        controlPoint1 = new Point(width * 15 / 14, height * 23 / 34);
        controlPoint2 = new Point(width * 21 / 28, height * 18 / 17);
        controlPoint3 = new Point(width * 7 / 28, height * 18 / 17);
        controlPoint4 = new Point(width * -1 / 14, height * 23 / 34);

        mPath.reset();

        mPath.moveTo(point1.x,point1.y);
        mPath.lineTo(point2.x,point2.y);
        mPath.lineTo(point3.x,point3.y);
        mPath.lineTo(point4.x,point4.y);
        mPath.lineTo(point5.x,point5.y);
        mPath.lineTo(point6.x,point6.y);
        mPath.lineTo(point7.x,point7.y);
        mPath.quadTo(controlPoint1.x,controlPoint1.y,point8.x,point8.y);
        mPath.cubicTo(controlPoint2.x,controlPoint2.y,controlPoint3.x,controlPoint3.y,point9.x,point9.y);
        mPath.quadTo(controlPoint4.x,controlPoint4.y,point1.x,point1.y);
        mPath.close();
        canvas.drawPath(mPath,mPaint);
    }
}
