test;
[pack1] {
[Class1]
  package pack1;
  
  public class Class1 {
    pack2.Class2 a;
    pack2.Class2 b;
  }
[Class2]
  package pack1;
  
}
[pack2] {
[Class2]
  package pack2;
  
  public class Class2 { }
}