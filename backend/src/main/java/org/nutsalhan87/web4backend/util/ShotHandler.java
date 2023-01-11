package org.nutsalhan87.web4backend.util;

public class ShotHandler {
    public static boolean isInRectangle(float x, float y, float r) {
        if (x > 0 || y < 0) {
            return false;
        }
        return y <= r && x >= -0.5 * r;
    }

    public static boolean isInTriangle(float x, float y, float r) {
        if (x > 0 || y > 0) {
            return false;
        }
        return y >= (-x - r / 2);
    }

    public static boolean isInQuartersphere(float x, float y, float r) {
        if (x < 0 || y > 0) {
            return false;
        }
        return (x * x + y * y) <= (r * r);
    }
}
