package consultation_0810;

public class ConstructorTest {

    int height;
    String name;

    double price;

    public ConstructorTest(int height) {
        this.height = height;
    }

    public ConstructorTest(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public ConstructorTest(int height, String name, double price) {
        this(height, name);
        this.price = price;
    }
}
