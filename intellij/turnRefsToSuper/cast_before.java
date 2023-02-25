test;
[Client]
    class Client {
     I getI() { return null; };
  
     void method() {
          A a = (A) getI();
     }
  
     int anotherMethod() {
         return ((A) getI()).method();
     }
  }
[I]
    interface I {
      int method();
  }
[A]
    class A implements I {
     int method() {
         return 0;
     }
  }
