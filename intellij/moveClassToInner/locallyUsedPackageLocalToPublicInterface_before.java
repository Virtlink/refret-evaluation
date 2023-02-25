test;
[pack2] {
[A]
    package pack2;
  
  public interface A {
  }
  
}
[pack1] {
[Class1]
    package pack1;
  
  class Class1 {
  }
[Usage]
    package pack1;
  class Usage {
    Class1 cl1;
  }
}
