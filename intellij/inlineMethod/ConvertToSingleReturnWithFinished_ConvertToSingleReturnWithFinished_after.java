test;
[ConvertToSingleReturnWithFinished]
    class A {
  
      void bar(int x) {
      if (x > 0) {
          String result = null;
          boolean finished = false;
          if (x > 0) {
            if (x == 10) {
                finished = true;
            } else {
                System.out.println(x);
            }
          }
          if (!finished) {
              result = String.valueOf(x);
          }
          System.out.println(result);
      }
      System.out.println("x < 0");
    }
  }
  
