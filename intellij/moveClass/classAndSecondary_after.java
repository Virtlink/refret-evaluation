test;
[pack2] {
[Class1]
    package pack2;
  
  public class Class1 {
  }
  
  /**
   * Javadoc.
   */
  class Class2 {
  
  }
}
[pack1] {
[User]
    package pack1;
  
  import pack2.Class1;
  import pack2.Class2;
  
  public class User {
    Class1 class1;
    Class2 class2;
  }
}
