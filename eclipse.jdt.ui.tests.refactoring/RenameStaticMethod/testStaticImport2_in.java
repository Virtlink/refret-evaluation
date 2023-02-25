test;
[p] {
[C]
    package p;
  
  import static p.A.*;
  
  public class C {
      void use() {
          int t= m();
      }
  }
  
[A]
    package p;
  
  public class A {
      public static int m() {
          return 0;
      }
  }
  
}
