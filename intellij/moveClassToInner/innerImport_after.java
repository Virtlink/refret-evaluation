test;
[pack2] {
[A]
    package pack2;

  public class [[@A|A]] {
      public static class [[@1|Class1]] {
      }
  }

}
[packUser] {
[Class2]
    package packUser;

  import [[->A|A|pack2.A]];

  public class Class2 {
    [[->1|Class1|A.Class1]] myClass1;
  }
}
