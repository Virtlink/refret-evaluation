test;
[pack2] {
[A]
    package pack2;
  
  public class A {
      public static class Class1 {
        class Inner {}
        Inner i;
      }
  }
  
}
[packUser] {
[Class2]
    package packUser;
  
  import pack2.A;
  
  public class Class2 {
    A.Class1 myClass1;
  }
}
