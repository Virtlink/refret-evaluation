test;
[pack2] {
[User2]
    package pack2;
  
  import target.pack1.*;
  
  public class User1 {
    Class1 a;
  }
[User1]
    package pack2;
  
  import target.pack1.Class1;
  
  public class User1 {
    Class1 a;
  }
}
[target.pack1] {
[Class1]
    package target.pack1;
  
  public class Class1 {
  }
}
