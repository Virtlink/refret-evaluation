test;
[pack1] {
[Class1]
  package pack1;
  
  public class Class1 { }
  public class Class2 { }
[User]
  package [[@pack1|pack1]];
  
  public class User {
    Class1 class1;
    Class2 class2;
  }
}
[pack2] {
[Class1]
  package pack2;
  
}
