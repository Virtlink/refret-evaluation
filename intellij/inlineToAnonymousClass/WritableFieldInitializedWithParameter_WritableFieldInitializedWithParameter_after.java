test;
[WritableFieldInitializedWithParameter]
    class A {
      public void doTest() {
          int i = 2;
          final int arg = i * 2;
          Object b = new Object() {
              private int i = arg;
  
              public String toString() {
                  i++;
                  return "A";
              }
          };
      }
  
  }
