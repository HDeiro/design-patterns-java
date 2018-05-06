public abstract class AbstractClass {
    public final void execute() {
        this.templateMethod1();
        System.out.println("Hey, you called the template method through execute");
        this.templateMethod2();
    }

    protected abstract void templateMethod1();
    protected abstract void templateMethod2();
}