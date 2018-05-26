package com.android.launcher2;

import android.graphics.Rect;

class RectCache extends SoftReferenceThreadLocal<Rect> {
    @Override
    protected Rect initialValue() {
        return new Rect();
    }
}