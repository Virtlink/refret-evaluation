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
          a.getMyDelegate().method2();
          use(a.getMyDelegate());
      }
  
      private void use(Intf i) {
      }
  }
[A]
    public class A {
  
      private final MyIntf myDelegate = new MyIntf();
  
      public Intf getMyDelegate() {
          return myDelegate;
      }
  
      public void method1() {
          myDelegate.method1();
      }
  
      private class MyIntf implements Intf {
          public void method1 () {
              System.out.println("1");
          }
  
          public void method2 () {
              System.out.println("2");
          }
      }
  }
