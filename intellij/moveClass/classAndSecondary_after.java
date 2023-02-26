test;
[pack2] {
[Class1]
    package pack2;

  public class [[1|Class1]] {
  }

  /**
   * Javadoc.
   */
  class [[2|Class2]] {

  }
}
[pack1] {
[User]
    package pack1;

  import [[->1|Class1|pack2.Class1]];
  import [[->2|Class2|pack2.Class2]];

  public class User {
    [[->1|Class1]] class1;
    [[->2|Class2]] class2;
  }
}
