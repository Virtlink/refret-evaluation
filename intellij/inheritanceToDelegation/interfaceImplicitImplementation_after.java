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
          a.getMyDelegate().method1();
          a.method2();
          use(a.getMyDelegate());
      }
  
      private void use(Intf i) {
      }
  }
[A]
    public class A extends ASuper {
      private final MyIntf myDelegate = new MyIntf();
  
      public Intf getMyDelegate() {
          return myDelegate;
      }
  
      private class MyIntf implements Intf {
          public void method1 () {
              System.out.println("1");
          }
  
          public void method2() {
              A.this.method2();
          }
      }
  }
[ASuper]
    public class ASuper {
      public void method2 () {
          System.out.println("2");
      }
  }
