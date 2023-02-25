test;
[Client]
    public class Client {
    String s = "pack1.A.Class1";
    // pack1.A.Class1
    // apack1.Class1
    // Class1
  }
[pack1] {
[A]
    package pack1;
  
  public class A {
      public static class Class1 {
      }
  }
}
