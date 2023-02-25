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
    void doStuff() {
    }
  }
  
[Class2]
    package pack1;
  
  class Class2 {
     public void test() {
       Class1 c1 = new Class1();
       c1.doStuff();
     }
  }
  
}
