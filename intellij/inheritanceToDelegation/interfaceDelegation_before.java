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
    public class A implements Intf {
      public void method1 () {
          System.out.println("1");
      }
  
      public void method2 () {
          System.out.println("2");
      }
  }
