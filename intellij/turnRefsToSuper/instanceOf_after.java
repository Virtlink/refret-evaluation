test;
[Client]
    class Client {
     int method(I a) {
         return a instanceof A;
     }
  }
[I]
    interface I {
  }
[A]
    class A implements I {
  }
