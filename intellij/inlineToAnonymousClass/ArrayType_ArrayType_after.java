test;
[ArrayType]
    class A {
      public void test() {
          Object[] b = new Object[1];
          b [0] = new Object() {
              public String toString() {
                  return "A";
              }
          };
      }
  
  }
