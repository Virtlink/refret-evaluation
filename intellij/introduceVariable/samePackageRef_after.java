test;
[pack1] {
[B]
    package pack1;
  
  class B {
  }
[A]
    package pack1;
  
  public class A {
      void method() {
          B b = new B();
      }
  }
}
