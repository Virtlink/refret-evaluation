test;
[p2] {
[B]
    package p2;
  import p1.A;
  public class B {
      A a;
      void foo() {
          a.m1();
      }
  }
  
[C]
    package p2;
  import p1.A;
  public class C {
      A a;
      void foo() {
          a.m2();
      }
  }
  
}
[p1] {
[A]
    package p1;
  public class A {
  public void m1() {
  }
  public void m2() {
  }
  }
}
