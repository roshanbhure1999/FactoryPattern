package abstractfactorypatternexample2;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("INSIDE TRIANGLE draw()");
    }
}
