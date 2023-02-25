test;
[p] {
[C]
    package p;
  
  import static p.A.m;
  
  public class C {
      void use() {
          int t= m();
      }
  }
  
[A]
    package p;
  
  import static p.A.m;
  
  public class A {
      public static int m() {
          return 0;
      }
  }
  
  class B {
      void use() {
          int t= m();
      }
  }
}
