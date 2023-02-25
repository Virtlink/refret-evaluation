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
  import p1.AA;
  
  public class C {
      AA a;
      void foo() {
          a.m2();
      }
  }
  
}
[p1] {
[AA]
    package p1;
  public class AA extends A {
      public void m2() {
  }
  }
[A]
    package p1;
  
  public class A {
      public void m1() {
      }
  }
  
}
