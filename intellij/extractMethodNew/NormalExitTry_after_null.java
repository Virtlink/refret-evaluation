test;
[NormalExitTry]
    class Test {
  
      private static void f(boolean a, boolean b) {
          if (a) {
              newMethod();
          } else {
              System.out.println("");
          }
      }
  
      private static void newMethod() {
          try {
              System.out.println();
              return;
          }
          catch (Exception e) {
              return;
          }
      }
  
  }
