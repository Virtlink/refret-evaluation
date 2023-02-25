test;
[p] {
[B]
    package p;
  
  class B {
    public static B create() {
      return new B();
    }
  }
  
[A]
    package p;
  
  class A {
  }
}
