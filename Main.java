package ru.netology.graphics;

import ru.netology.graphics.image.*;
import ru.netology.graphics.server.GServer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
       // String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";

        TextGraphicsConverter converter = new Converter_Test(); // Создайте тут объект вашего класса конвертера
        TextColorSchema schema =new ColorShema_Test();
        System.out.println(schema.convert(150));
        System.out.println(schema.convert(81));
        System.out.println(schema.convert(61));
       // GServer server = new GServer(converter); // Создаём объект сервера
      //  server.start(); // Запускаем

        // Или то же, но с выводом на экран:
       String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
       System.out.println(imgTxt);
    }
}
