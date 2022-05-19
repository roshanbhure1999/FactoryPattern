package abstractfactorypatternexample2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFact shapeFactory = FactoryProcedure.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFact shapeFactory1 = FactoryProcedure.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();

    }
}
