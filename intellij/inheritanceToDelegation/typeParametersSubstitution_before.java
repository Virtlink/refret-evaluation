test;
[Intf]
    public interface Intf<T> {
      void method1(T t);
  }
[A]
    public class A implements Intf<Integer> {
      public void method1(Integer t) {
      }
  }
