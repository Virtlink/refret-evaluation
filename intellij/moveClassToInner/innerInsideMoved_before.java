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
    class Inner {}
    Inner i;
  }
}
[packUser] {
[Class2]
    package packUser;
  
  import pack1.Class1;
  
  public class Class2 {
    Class1 myClass1;
  }
}
