[[{move-class(1, pack2)}]]
test;
[Client]
  public class Client {
    String s = "pack1.Class1";
    // pack1.Class1
    // apack1.Class1
    // Class1
  }
[pack1] {
[Class1]
  package pack1;
  
  public class [[@1|Class1]] { }
}
[pack2] {
[Class1]
  package [[@pack2|pack2]];
  
}