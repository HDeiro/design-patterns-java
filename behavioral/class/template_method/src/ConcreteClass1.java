public class ConcreteClass1 extends AbstractClass {
    protected void abstractMethod1() {
        System.out.println("You invoked abstractMethod1() for ConcreteClass1");
    }
    protected void abstractMethod2() {
        System.out.println("You invoked abstractMethod2() for ConcreteClass1");
    }
    public void otherMethod() {
        System.out.println("Hey, you invoked other method that is not Template Method");
    }
}