test;
[WritableInitializedField]
    class A {
      private Object b = new Object() {
          private int i = 0;
  
          public String toString() {
              i++;
              return "A";
          }
      };
  
  }
