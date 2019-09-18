package com.wjk.scce;

public class ButtonUtils {
    private static final int MIN_DELAY_TIME = 1000;//这个表示两次点击间隔时间不少于1000
    private static long lastClickTime;
    public static boolean isFastClick() {
        boolean flag = true;
        long currentClickTime = System.currentTimeMillis();
        if ((currentClickTime - lastClickTime) >= MIN_DELAY_TIME) {
            flag = false;
        }
        lastClickTime = currentClickTime;
        return flag;
    }
}
