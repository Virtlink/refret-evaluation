test;
[pack2] {
[A]
    package pack2;
  
  public class A {
      /**
       * pack2.A.Class0
       */
      public static class Class1 {
        Class0 cl0;
      }
  
      /**
       * pack2.A.Class1
       */
      public static class Class0 {
        Class1 cl1;
      }
  }
  
}
[packUser] {
[Class2]
    package packUser;
  
  import pack2.A;
  
  /**
   * pack2.A.Class1
   * pack2.A.Class0
   */
  public class Class2 {
    A.Class1 myClass1;
    A.Class0 myClass0;
  }
}