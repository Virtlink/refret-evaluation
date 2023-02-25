test;
[p] {
[B]
    package p;
  
  class B {
      B() {
          System.out.println("Constructor");
      }
  }
  
[A]
    package p;
  
  class A {
      public void test() {
          B b = new B();
      }
  
  }
}
