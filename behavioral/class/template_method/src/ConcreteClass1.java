public class ConcreteClass1 extends AbstractClass {
    protected void templateMethod1() {
        System.out.println("You invoked templateMethod1() for ConcreteClass1");
    }
    protected void templateMethod2() {
        System.out.println("You invoked templateMethod2() for ConcreteClass1");
    }
    public void otherMethod() {
        System.out.println("Hey, you invoked other method rather than Template Method");
    }
}