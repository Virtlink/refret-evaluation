test;
[p] {
[B]
    package p;
  
  import p.b.A;
  
  public class B extends A {
      private B() {
          System.out.println("Constructor");
      }
  }
  
}
[p.b] {
[A]
    package p.b;
  
  class A {
      protected A() {
      }
  
  }
}
