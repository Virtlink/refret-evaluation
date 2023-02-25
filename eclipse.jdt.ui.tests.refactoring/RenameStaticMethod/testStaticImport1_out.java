test;
[p] {
[C]
    package p;
  
  import static p.A.k;
  
  public class C {
      void use() {
          int t= k();
      }
  }
  
[A]
    package p;
  
  import static p.A.k;
  
  public class A {
      public static int k() {
          return 0;
      }
  }
  
  class B {
      void use() {
          int t= k();
      }
  }
}
