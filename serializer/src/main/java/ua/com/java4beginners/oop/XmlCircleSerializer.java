package ua.com.java4beginners.oop;

import java.io.IOException;
import java.io.OutputStream;

public class XmlCircleSerializer {

    public void serialize(Circle circle, OutputStream out) throws IOException {
        write(out, "<circle>");
        write(out, "<x>");
        write(out, String.valueOf(circle.getX()));
        write(out, "</x>");
        write(out, "<y>");
        write(out, String.valueOf(circle.getY()));
        write(out, "</y>");
        write(out, "<radius>");
        write(out, String.valueOf(circle.getRadius()));
        write(out, "</radius>");
        write(out, "</circle>");
    }

    private void write(OutputStream out, String s) throws IOException {
        out.write(s.getBytes());
    }
}
