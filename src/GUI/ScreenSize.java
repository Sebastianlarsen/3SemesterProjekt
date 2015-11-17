package GUI;

import java.awt.*;


/**
 * Created by Sebastian on 31-10-2015.
 */
public class ScreenSize {

   private static Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();


    private static int screenWidth = (int) ScreenSize.getWidth();
    private static int screenHeight = (int) ScreenSize.getHeight();

    private int frameWidth = screenWidth/2;
    private int frameHeight = screenHeight/2;

    public static int getScreenWidth() {
        return screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }
}
