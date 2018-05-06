public abstract class AbstractClass {
    public final void templateMethod() {
        this.abstractMethod1();
        System.out.println("Hey, Template Method were invoked");
        this.abstractMethod2();
    }

    protected abstract void abstractMethod1();
    protected abstract void abstractMethod2();
}