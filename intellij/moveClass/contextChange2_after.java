test;
[pack1] {
[Class2]
  package pack1;
  
  public class Class2 {
    static int xxx() { return 0; }
  }
}
[pack2] {
[Class1]
  package pack2;
  
  public class Class1 {
    void foo(){
      pack1.Class2.xxx();
    }
  }
}