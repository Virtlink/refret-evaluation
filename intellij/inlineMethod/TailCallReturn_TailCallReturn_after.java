test;
[TailCallReturn]
    class A {
  
      public String method(boolean b) {
          if (b) {
              return "b";
          }
          return "a";
      }
  }
