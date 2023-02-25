test;
[pack2] {
[Usage]
    package pack2;
  
  import static pack1.A.staticMethod;
  
  class Usage {
      {
          staticMethod(27);
      }
  }
}
[pack1] {
[A]
    package pack1;
  
  public class A {
      public static void staticMethod(int i) {
      }
  
      private static void staticMethod(String s) {
      }
  }
}
