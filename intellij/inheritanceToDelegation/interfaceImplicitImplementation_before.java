test;
[Intf]
    public interface Intf {
      void method1();
      void method2();
  }
[Usage]
    public class Usage {
      A a = new A();
  
      public void usage() {
          a.method1();
          a.method2();
          use(a);
      }
  
      private void use(Intf i) {
      }
  }
[A]
    public class A extends ASuper implements Intf {
      public void method1 () {
          System.out.println("1");
      }
  }
[ASuper]
    public class ASuper {
      public void method2 () {
          System.out.println("2");
      }
  }
