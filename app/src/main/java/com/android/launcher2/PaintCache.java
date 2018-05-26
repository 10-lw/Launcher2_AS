package com.android.launcher2;

import android.graphics.Paint;

class PaintCache extends SoftReferenceThreadLocal<Paint> {
    @Override
    protected Paint initialValue() {
        return null;
    }
}