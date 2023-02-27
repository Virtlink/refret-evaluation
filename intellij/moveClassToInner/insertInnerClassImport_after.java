test;
[pack2] {
[A]
    package pack2;

  public class A {
      public static class [[@1|Class1]] {
      }
  }

}
[packUser] {
[Class2]
    package packUser;

  import [[->1|Class1|pack2.A.Class1]];

  public class Class2 {
    [[->1|Class1]] myClass1;
  }
}
