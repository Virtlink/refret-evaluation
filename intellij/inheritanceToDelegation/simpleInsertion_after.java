test;
[B]
    class B {
      public final A myDelegate = new A();
  
      public void methodFromA() {
          myDelegate.methodFromA();
      }
  
      public int intMethodFromA(int i) {
          return myDelegate.intMethodFromA(i);
      }
  }
[A]
    class A {
      public void methodFromA() {
      }
      public int intMethodFromA(int i) {
          return 0;
      }
  }
