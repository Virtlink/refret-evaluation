test;
[pack2] {
[A]
    package pack2;
  
  public class A {
  }
  
}
[pack1] {
[Class1]
    package pack1;
  
  public class Class1 {
    void foo(){
      Class2.xxx();
    }
  }
[Class2]
    package pack1;
  
  public class Class2 {
  }
}
