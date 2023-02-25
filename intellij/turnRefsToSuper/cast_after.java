test;
[Client]
    class Client {
     I getI() { return null; };
  
     void method() {
          I a = getI();
     }
  
     int anotherMethod() {
         return getI().method();
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
