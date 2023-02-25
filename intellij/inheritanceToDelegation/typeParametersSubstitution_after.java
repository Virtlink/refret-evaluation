test;
[Intf]
    public interface Intf<T> {
      void method1(T t);
  }
[A]
    public class A {
      public final MyIntf myDelegate = new MyIntf();
  
      private class MyIntf implements Intf<Integer> {
          public void method1(Integer t) {
          }
      }
  }
