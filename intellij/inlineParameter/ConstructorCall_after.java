test;
[Test]
    class A {
      private int myI;
  
      private A() {
          myI = 0;
      }
  
      public static A create() {
          return new A();
      }
  }
