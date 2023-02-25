test;
[test] {
[Client]
    package test;
  
  public class Client {
      public static void method() {
          final List<A.B> l = X.getList();
      }
  }
[List]
    package test;
  
  public class List<E> {
  }
[X]
    package test;
  
  public class X {
      public static List<A.B> getList() { return null; } 
  }
[A]
    package test;
  
  public class A {
      public static class B {
      }
  }
}
