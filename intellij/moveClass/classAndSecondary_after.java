test;
[pack1] {
[Class1]
    package pack1;

  public class Class1 {
  }

  /**
   * Javadoc.
   */
  class Class2 {

  }
}
[pack2] {
[User]
  package pack2;

  public class User {
    pack1.Class1 class1;
    pack1.Class2 class2;
  }
}