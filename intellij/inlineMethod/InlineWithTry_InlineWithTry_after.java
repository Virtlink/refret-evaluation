test;
[InlineWithTry]
    class A {
      {
          try {
          } catch (Error e) {
              throw e;
          }
      }
  }
  
