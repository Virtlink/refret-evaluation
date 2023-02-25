test;
[Base]
    public class Base extends A {
  }
[Test]
    public interface Test {
      A getA();
  }
[X]
    public class X {
      private final Base myDelegate = new Base();
      A myField;
      public void method(Test t) {
           myField = t.getA();
           myField.methodFromA();
           t.getA().methodFromA();
      }
  }
[A]
    public class A {
      void methodFromA() {
      }
  }
