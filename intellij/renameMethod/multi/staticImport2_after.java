test;
[pack2] {
[Usage]
    package pack2;
  
  import static pack1.A.*;
  
  class Usage {
      {
          renamedStaticMethod(27);
      }
  }
}
[pack1] {
[A]
    package pack1;
  
  public class A {
      public static void renamedStaticMethod(int i) {
      }
  }
}
