test;
[pack2] {
[B]
    package pack2;
  
  import pack1.Outer;
  
  import java.util.ArrayList;
  import java.util.List;
  
  public class B {
      public static void foo(){
          Outer<ArrayList>.Inner<List> x;
      }
  }
}
[pack1] {
[Outer]
    package pack1;
  
  public class Outer <T>{
      public static class Inner<T>{
      }
  }
  
[A]
    package pack1;
  
  public class A {
  }
}
