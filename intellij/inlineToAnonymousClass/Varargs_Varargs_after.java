test;
[Varargs]
    class A {
      public void test() {
          final int[] values = new int[]{1, 2, 3};
          Object o = new Object() {
              private int length;
  
              {
                  length = values.length;
              }
  
              public String toString() {
                  return Integer.toString(length);
              }
          };
      }
    
  }
