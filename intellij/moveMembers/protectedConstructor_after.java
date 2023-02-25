test;
[pack2] {
[B]
    package pack2;
  
  public class B {
    protected B(){}
  }
}
[pack1] {
[C]
    package pack1;
  
  public class C {
      public static void foo() {
          new B(){};
      }
  }
[A]
    package pack1;
  
  public class A {
  }
}
