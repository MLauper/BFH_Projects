package ch.bfh.ti.emailaddr2png;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreateImage {
    public void generate(String address, String file, int width) throws IOException {
        BufferedImage image = new BufferedImage(width, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        //background
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, width, 30);

        //string
        g.setColor(Color.BLACK);
        Font font = new Font("Courier", 1, 20);
        g.setFont(font);
        g.drawString(address, 15, 20);

        //save imagefile using the filename and filepath defined in the filechooser
        String filepath = file;
        try {
            ImageIO.write(image, "png", new File(filepath + ".png"));
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}