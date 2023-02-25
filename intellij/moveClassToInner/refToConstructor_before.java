test;
[pack2] {
[A]
    package pack2;
  
  public class A {
  }
  
}
[pack1] {
[Class1]
    package pack1;
  
  public class Class1 {
      public static Class1 createInstance() {
          return new Class1();
      }
  }
}
