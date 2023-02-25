test;
[Client]
    public class Client {
      Class getClass() {
          return A.class;
      }
  
      int m(I a) {
          return I.method();
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
