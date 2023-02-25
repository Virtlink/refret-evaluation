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
  }
[A]
    package pack1;
  
  public class A {
      public static void foo() {
          new B(){};
      }    
  }
}
