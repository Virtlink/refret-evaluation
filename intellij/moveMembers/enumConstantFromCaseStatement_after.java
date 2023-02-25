test;
[B]
    public class B {
      void foo(A i) {
          switch (i) {
              case ONE :
                break;
          }
      }
  }
  
  class Usage {
      void foo(A i) {
          switch (i) {
              case ONE :
                break;
          }
      }
  }
[A]
    public enum A {
      ONE(1);
    A(int i){}
  }
