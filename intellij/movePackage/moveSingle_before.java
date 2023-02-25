test;
[pack2] {
[User2]
    package pack2;
  
  import pack1.*;
  
  public class User1 {
    Class1 a;
  }
[User1]
    package pack2;
  
  import pack1.Class1;
  
  public class User1 {
    Class1 a;
  }
}
[pack1] {
[Class1]
    package pack1;
  
  public class Class1 {
  }
}
