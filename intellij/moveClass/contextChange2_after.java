test;
[pack2] {
[Class1]
    package pack2;
  
  import pack1.Class2;
  
  public class Class1 {
    void foo(){
      Class2.xxx();
    }
  }
}
[pack1] {
[Class2]
    package pack1;
  
  public class Class2 {
  }
}
