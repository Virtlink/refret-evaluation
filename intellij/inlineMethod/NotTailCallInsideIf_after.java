test;
[Test]
    class A {
  
      void bar(int x) {
      if (x > 0) {
          if(Math.random() > 2) {
            System.out.println("xyz");
          } else {
              System.out.println("oops");
          }
      }
      System.out.println("x < 0");
    }
  }
  
