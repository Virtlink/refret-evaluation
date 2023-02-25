test;
[pack2] {
[A]
    package pack2;
  
  public interface A {
      class Class1 {
      }
  }
  
}
[pack1] {
[Usage]
    package pack1;
  
  import pack2.A;
  
  class Usage {
    A.Class1 cl1;
  }
}
