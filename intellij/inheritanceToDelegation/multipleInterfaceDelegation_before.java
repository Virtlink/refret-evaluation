test;
[Intf]
    public interface Intf {
      void method1();
  }
[Intf2]
    public interface Intf2 {
      void method2();
  }
[A]
    public class A implements Intf, Intf2 {
      public void method1() {
          method2();
      }
  
      public void method2 () {
          System.out.println("2");
      }
  }
