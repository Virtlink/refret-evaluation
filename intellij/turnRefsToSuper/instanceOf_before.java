test;
[Client]
    class Client {
     int method(A a) {
         return a instanceof A;
     }
  }
[I]
    interface I {
  }
[A]
    class A implements I {
  }
