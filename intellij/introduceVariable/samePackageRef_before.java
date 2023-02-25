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
          <selection>new B()</selection>
      }
  }
}
