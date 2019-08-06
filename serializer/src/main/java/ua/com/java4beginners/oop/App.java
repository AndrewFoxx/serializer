package ua.com.java4beginners.oop;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        XmlCircleSerializer serializer = new XmlCircleSerializer();
        Circle circle = new Circle(0, 1, 10);
        serializer.serialize(circle, System.out);
    }
}
