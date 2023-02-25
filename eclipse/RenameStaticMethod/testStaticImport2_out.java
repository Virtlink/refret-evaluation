test;
[p] {
[C]
    package p;
  
  import static p.A.*;
  
  public class C {
      void use() {
          int t= k();
      }
  }
  
[A]
    package p;
  
  public class A {
      public static int k() {
          return 0;
      }
  }
  
}
