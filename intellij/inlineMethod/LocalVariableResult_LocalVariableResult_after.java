test;
[LocalVariableResult]
    class A {
  
      Integer f(int i) {
          Integer result;
          if (i > 0) {
              result = new Integer(i);
          }
          else {
              Integer result;
              result = new Integer(0);
              result = result;
          }
          return result;
      }
  
  }
