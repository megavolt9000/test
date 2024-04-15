package ru.netology.graphics.image;
import org.w3c.dom.ls.LSOutput;
import ru.netology.graphics.image.ColorShema_Test;
import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.io.FileWriter;

import javax.imageio.ImageIO;


public class Converter_Test implements TextGraphicsConverter {
    int width;
    int height;
    String textDone;
    private int pixelValue;
    private PrintWriter prntwrt;
    private FileWriter fileWriter;

    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        String textDone1;
        this.textDone = null;

        FileWriter writer = new FileWriter("converted-image.txt", false);
        TextColorSchema schema = new ColorShema_Test();
        BufferedImage img = ImageIO.read(new URL(url));
        width = img.getWidth();
        height = img.getHeight();
        // String textDone = null;
        // StringBuilder sb = new StringBuilder((img.getWidth()+1)*img.getHeight());
        for (int i = 0; i < img.getHeight(); i++) {
            System.out.print("\n");
            for (int j = 0; j < img.getWidth(); j++) {
                Color pixelcolor = new Color(img.getRGB(j, i));
                pixelValue = (int) ((pixelcolor.getRed() * 0.30) + (pixelcolor.getBlue() * 0.59) + (pixelcolor.getGreen() * 0.11));
                String text = Character.toString(schema.convert(pixelValue));
                textDone1 = text + text;
                textDone = textDone1;

                writer.append(textDone);
                writer.append('\n');
                writer.write(textDone);

                System.out.print(textDone);

                // return  textDone;
                //  String textDone=text;
                //  System.out.println(schema.convert(pixelValue));
            }
            //
        }
        //  System.out.println(width);
        // System.out.println(height);
        //return  Character.toString(schema.convert(pixelValue));
        //System.out.println(textDone);
        return textDone;

    }

    @Override
    public void setMaxWidth(int width) {
    }

    @Override
    public void setMaxHeight(int height) {

    }

    @Override
    public void setMaxRatio(double maxRatio) {

    }

    @Override
    public void setTextColorSchema(TextColorSchema schema) {

    }


}
