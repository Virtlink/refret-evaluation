test;
[ConvertToSingleReturnWithFinishedUnusedResult]
    class A {
  
      void bar(int x) {
      if (x > 0) {
          if (x > 0) {
            if (x != 10) {
                System.out.println(x);
            }
          }
      }
      System.out.println("x < 0");
    }
  }
  
