package com.example.emobadaragaminglib.Base;

import java.util.List;

/**
 * this interface is used to map between the types of different events
 * TODO: Implement the Touch_hold
 */
public interface Input {
    /**
     * Enumeration and Organization of Work
     */
    class TouchEvent {
        public static final int TOUCH_DOWN = 0;
        public static final int TOUCH_UP = 1;
        public static final int TOUCH_DRAGGED = 2;
        public static final int TOUCH_HOLD = 3;

        public int type;
        public int x, y;
        public int pointer;
    }

    class KeyEvent {
        public static final int KEY_DOWN = 0;
        public static final int KEY_UP = 1;

        public int type;
        public int keyCode;
        public char keyChar;

    }

    public boolean isKeyPressed(int keyCode);

    public List<KeyEvent> getKeyEvents();

    public float getAccelX();

    public float getAccelY();

    public float getAccelZ();

    boolean isTouchDown(int pointer);

    int getTouchX(int pointer);

    int getTouchY(int pointer);

    List<TouchEvent> getTouchEvents();

    //Compass

    public float getYaw();

    public float getPitch();

    public float getRoll();

}