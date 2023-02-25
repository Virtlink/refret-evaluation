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
    private Class2 c2;
  }
[Class2]
    package pack1;
  
  class Class2 {
  }
  
}
