test;
[Test]
    class A {
  
      void bar(int x) {
      if (x > 0) {
          if(Math.random() > 2) {
            System.out.println("xyz");
            return;
          }
          System.out.println("oops");
      } else {
        System.out.println("x < 0");
      }
    }
  
    void baz(int x) {
      if (x > 0)
        if (x < 10) {
            if(Math.random() > 2) {
              System.out.println("xyz");
              return;
            }
            System.out.println("oops");
        }
    }
  }
  
