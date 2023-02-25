test;
[pack2] {
[Class1]
    package pack2;
  
  public class Class1 {
  }
}
[Client]
    public class Client {
    String s = "pack2.Class1";
    // pack2.Class1
    // apack1.Class1
    // Class1
  }
