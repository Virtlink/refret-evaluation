test;
[Base]
    public class Base {
      protected int baseField;
      public Base() {
      }
      public Base(int i) {
          baseField = i;
      }
      public void methodToOverride() {
          System.out.println("Hello from Base");
      }
  }
[A]
    public class A extends Base {
      public A() {
          super(27);
      }
      public void methodToOverride() {
          System.out.println("Hello from B");
      }
  }
