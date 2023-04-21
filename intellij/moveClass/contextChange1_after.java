test;
[pack1] {
[Class2]
  package pack1;
  
  public class Class2 { }
}
[pack2] {
[Class1]
  package [[@pack2|pack2]];

  public class Class1 {
    pack1.Class2 a;
  }
}
