test;
[Test]
    class Tester {
      boolean a;
  
      native void doB();
  
      // IDEA-158665
  
      void useInlinedMethod() {
          if (!a) {
              doB();
          }
          System.out.println("ok");
      }
  }
