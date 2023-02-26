test;
[SuperClass]
    public class SuperClass {
  }

  public class SubClass extends SuperClass {
      public void doSomethingElse() {
          [[->1|doSomething|UtilClass.doSomething]](this);
      }
  }

  public class UtilClass {
      public static void [[1|doSomething]](SuperClass superClass) {
          // ...
      }
  }
