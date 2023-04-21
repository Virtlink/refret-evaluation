[[# fails]]
[[{move-class(1, pack1)}]]
test;
[pack1] {
[Class1]
  package pack1;
  
  public class Class1 { }
[User]
  package [[@pack1|pack1]];
  
  public class User {
    Class1 class1;
    pack2.Class2 class2;
  }
}
[pack2] {
[Class1]
  package pack2;
  
  public class [[@1|Class2]] { }
}
