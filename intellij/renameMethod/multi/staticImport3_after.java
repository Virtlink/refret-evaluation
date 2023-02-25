test;
[pack2] {
[Usage]
    package pack2;
  
  import pack1.A;
  
  class Usage {
      {
          A.renamedStaticMethod(27);
      }
  }
}
[pack1] {
[A]
    package pack1;
  
  public class A {
      public static void renamedStaticMethod(int i) {
      }
  
      public static void staticMethod(String s) {
      }
  }
}
