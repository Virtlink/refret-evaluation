test;
[pack2] {
[A]
    package pack2;
  
  import pack1.Class2;
  
  public class A {
      public static class Class1 {
          Class2 a;
      }
  }
  
}
[pack1] {
[Class2]
    package pack1;
  
  public class Class2 {
  }
}
