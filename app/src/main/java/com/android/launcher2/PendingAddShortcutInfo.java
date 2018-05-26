package com.android.launcher2;

import android.content.pm.ActivityInfo;

class PendingAddShortcutInfo extends PendingAddItemInfo {

    ActivityInfo shortcutActivityInfo;

    public PendingAddShortcutInfo(ActivityInfo activityInfo) {
        shortcutActivityInfo = activityInfo;
    }

    @Override
    public String toString() {
        return "Shortcut: " + shortcutActivityInfo.packageName;
    }
}
