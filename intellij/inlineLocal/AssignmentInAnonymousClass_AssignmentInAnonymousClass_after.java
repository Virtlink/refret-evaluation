test;
[AssignmentInAnonymousClass]
    class X {
     void use() {
          int x = 2;
          new A(x, 3, 3){};
      }
  
      static class A {
          A(int x1, int x2, int x3) {}
      }
  }
