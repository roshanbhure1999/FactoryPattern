package abstractfactorypatternexample2;

public class FactoryProcedure {
    public static AbstractFact getFactory(boolean rounded) {
        if (rounded) {
            return new RoundFactory();
        } else {
            return new ShapeFactory();
        }
    }
}