test;
[B]
    class B extends A {
      public B() {
          super(1);
      }
    
      public B(int i) {
          super(i);
      }
  }
[A]
    class A {
      public A(int i) {
      }
      public void methodFromA() {
      }
      public int intMethodFromA(int i) {
          return 0;
      }
  }
