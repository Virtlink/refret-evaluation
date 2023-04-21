[[{move-class(1, pack2)}]]
test;
[pack1] {
[Class1]
  package pack1;
  
  public class [[@1|Class1]] { }
}
[pack2] {
[Class1]
  package [[@pack2|pack2]];
}