package brComFrame.util.reports;

import brComFrame.util.DateUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    public void takeScreenShoot() throws AWTException, IOException {

        Robot awt_robot = new Robot();
        BufferedImage Entire_Screen = awt_robot.createScreenCapture(
                new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(Entire_Screen, "PNG", new File("evidence/word/screenshot/" + DateUtils.getDateAndTime() + ".png"));

    }
}
