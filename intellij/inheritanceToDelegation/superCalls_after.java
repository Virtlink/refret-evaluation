test;
[B]
    class B {
      public final A myDelegate;
  
      public B() {
          myDelegate = new A(1);
      }
    
      public B(int i) {
          myDelegate = new A(i);
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
