package GUI;

import java.awt.*;


/**
 * Created by Sebastian on 31-10-2015.
 */
public class ScreenSize {

   private static Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();


    private static int screenWidth = (int) ScreenSize.getWidth();
    private static int screenHeight = (int) ScreenSize.getHeight();

    private double frameWidth = screenWidth/1.6;
    private double frameHeight = screenHeight/1.6;

    public static int getScreenWidth() {
        return screenWidth;
    }

    public static int getScreenHeight() {
        return screenHeight;
    }

    public double getFrameWidth() {
        return frameWidth;
    }

    public double getFrameHeight() {
        return frameHeight;
    }
}
