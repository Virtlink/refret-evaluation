test;
[pack2] {
[B]
    package pack2;
  
  public class B {
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
  
  import java.util.ArrayList;
  import java.util.List;
  
  public class A {
      public static void foo(){
          Outer<ArrayList>.Inner<List> x;
      }
  }
}
