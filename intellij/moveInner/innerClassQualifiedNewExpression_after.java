test;
[p] {
[B]
    package p;
  
  public class B {
    public static B create() {
      return new B();
    }
  }
  
[A]
    package p;
  
  class A {
  }
  
  class U {
    void m(A a) {
      B b = new B();
    }
  }
}
