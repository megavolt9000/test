package ru.netology.graphics.image;
import ru.netology.graphics.image.ColorShema_Test;
import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


public class Converter_Test implements TextGraphicsConverter {
private int pixelValue;
private PrintWriter prntwrt;
private FileWriter fileWriter;
    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        TextColorSchema schema =new ColorShema_Test();
        BufferedImage img = ImageIO.read(new URL(url));
        for (int i = 0; i < img.getHeight(); i++)
        {
            for (int j = 0; j < img.getWidth(); j++)
            {
                Color pixelcolor = new Color(img.getRGB(j, i));
                pixelValue = (int) ((pixelcolor.getRed() * 0.30) + (pixelcolor.getBlue() * 0.59) + (pixelcolor.getGreen() * 0.11));
            }
           String textDone = Character.toString(schema.convert(pixelValue))+pixelValue;
        }

        return  Character.toString(schema.convert(pixelValue));
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
