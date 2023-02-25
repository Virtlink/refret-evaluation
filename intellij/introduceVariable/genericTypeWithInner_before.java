test;
[test] {
[Client]
    package test;
  
  public class Client {
      public static List<A.B> getList() { return null; }
    
      public static void method() {
           <selection>getList()</selection>
      }
  }
[List]
    package test;
  
  public class List<E> {
  }
[A]
    package test;
  
  public class A {
      public static class B {
      }
  }
}
