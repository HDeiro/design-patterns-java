public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass1();
        instance.execute();
        instance = new ConcreteClass2();
        instance.execute();
    }
}