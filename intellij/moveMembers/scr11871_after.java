test;
[pack1] {
[B]
    package pack1;
  
  public class B {
      static void method() {
          A.Inner i = new A.Inner();
      }
  }
[A]
    package pack1;
  
  public class A {
  
      class Inner {
      } 
  }
}
