package ua.com.java4beginners.oop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class XmlSerializerTest {

    @Test
    public void testXmlCircleSerializer() throws IOException {
        // given
        XmlCircleSerializer serializer = new XmlCircleSerializer();
        Circle circle = new Circle(0, 1, 10);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // when
        serializer.serialize(circle, out);
        //then
        String expected = "<circle><x>0</x><y>1</y><radius>10</radius></circle>";
        assertThat(out.toString(), is(expected));
    }
}
