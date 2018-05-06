## Template Method

Template Method is known as a behavioural pattern and it's used to manage algorithms relationships and responsabilities between objects. The main definition of Template Method provided by the GOF is:

> _Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure._

Basically, the Template Method is a method that can pre-implement some details and invoke other methods. You would like to use it when:

- The behaviour of the algorithm can vary. So, you define the main behaviour and let the classes extend it through overriding;
- You want to avoid code duplication, implementing variations of the algorithm in subclasses;
-  You want to control the point that subclass is allowed.

![Template Method](https://github.com/HDeiro/design-patterns-java/blob/master/behavioral/class/template_method/TemplateMethod.PNG?raw=true)

You have an abstract class that contains a final and concrete method, that is your template method. This will invoke the abstract methods that will be implemented on subclasses.
