test;
[B]
    public class B {
      static void foo() {
      }
  
      static class Bar {
          void foo() {
              B.foo();
          }
      }
  }
  
[A]
    public class A {
  
  }
  
