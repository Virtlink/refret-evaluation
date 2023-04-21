[[{move-class(1, pack2)}]]
test;
[pack1] {
[AClass]
  package pack1;
  
  public class [[@1|AClass]] {
    String s = "pack1.AClass";
  }
  
}
[pack2] {
[AClass]
  package [[@pack2|pack2]];
}