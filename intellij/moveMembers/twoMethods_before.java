test;
[pack2] {
[B]
    package pack2;
  
  public class B {
  }
}
[pack1] {
[C]
    package pack1;
  
  public class C {
  }
[A]
    package pack1;
  
  public class A {
      public static int ourField = 10;
      private static void bar() {
          foo();
          ourField = 11;
      }
  
      public static void foo() {
          bar();
      }    
  }
}
