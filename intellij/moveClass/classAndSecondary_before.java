[[{move-class(1, pack2)}]]
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
[User]
    package pack1;
  
  public class [[@1|User]] {
    Class1 class1;
    Class2 class2;
  }
}
[pack2] {
[User]
    package [[@pack2|pack2]];
}