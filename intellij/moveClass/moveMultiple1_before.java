[[# fails]]
[[{move-class(1, pack2)}]]
test;
[pack1] {
[Class1]
  package pack1;
  
  public class Class1 {
    Class2 a;
    Class2 b;
  }
[Class2]
  package pack1;
  
  public class [[@1|Class2]] { }
}
[pack2] {
  [Class2]
  package [[@pack2|pack2]];
}