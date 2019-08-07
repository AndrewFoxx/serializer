# oop

### Serializer

Tasks:

- Add class Rectangle with fields int x, y, height, width.
- Implement XmlRectangleSerializer. JUnit test is required.
- Add class Point(int x, y)
- Implement XmlPointSerializer, with tests of course.
- Add class Triangle, with fields Point first, second, third;
- Implement XmlTriangleSerializer utilizing XmlPointSerializer
- Add interface `Shape` with method `String getType();`.
- Make all shapes impelemts `Shape` interface.
- Introduce new interface `Serializer<T extends Shape>` with method `void serialize(T shape, OutputStream out);`.
- Make all serializers implements interface `Serializer`.
- Add class `Group` that implements `Shape` and contains list of other Shapes inside.
- Implement `XmlGroupSerializer`.