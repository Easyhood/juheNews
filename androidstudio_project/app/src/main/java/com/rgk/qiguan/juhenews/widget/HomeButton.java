package com.rgk.qiguan.juhenews.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description: 主菜单按键小控件
 * Copyright  : Copyright (c) 2016
 * Company    : RGK
 * Author     : qi.guan
 * Date       : 2017/11/7 14:59
 */

public class HomeButton extends View {

    private Paint mPaint;
    private int height;
    private int width;
    private PointF point1;
    private PointF point2;
    private PointF point3;
    private PointF point4;
    private PointF point5;
    private PointF point6;
    private PointF point7;
    private PointF point8;
    private PointF point9;
    private Path mPath;

    public HomeButton(Context context) {
        super(context);
        init();
    }

    public HomeButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HomeButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint = new Paint();
        mPath = new Path();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(3f);
        mPaint.setStyle(Paint.Style.FILL);
    }
    

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        height = getHeight();
        width = getWidth();

        point1 = new PointF(0, height / 2);
        point2 = new PointF(width / 2, 0);
        point3 = new PointF(width, height / 2);
        point4 = new PointF(width, height);
        point5 = new PointF(width * 3 / 5, height);
        point6 = new PointF(width * 3 / 5, height *2/ 3);
        point7 = new PointF(width * 2 / 5, height *2/ 3);
        point8 = new PointF(width * 2 / 5, height);
        point9 = new PointF(0, height);

         mPath.reset();

         mPath.moveTo(point1.x,point1.y);
         mPath.lineTo(point2.x,point2.y);
         mPath.lineTo(point3.x,point3.y);
         mPath.lineTo(point4.x,point4.y);
         mPath.lineTo(point5.x,point5.y);
         mPath.lineTo(point6.x,point6.y);
         mPath.lineTo(point7.x,point7.y);
         mPath.lineTo(point8.x,point8.y);
         mPath.lineTo(point9.x,point9.y);
         mPath.lineTo(point1.x,point1.y);
         mPath.close();
         canvas.drawPath(mPath,mPaint);
    }
}
