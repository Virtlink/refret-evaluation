test;
[pack1] {
[B]
    package pack1;
  
  public class B {
  }
[A]
    package pack1;
  
  public class A {
      static void method() {
          Inner i = new Inner();
      }
  
      class Inner {
      } 
  }
}
