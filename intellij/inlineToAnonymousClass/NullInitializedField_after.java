test;
[Test]
    class A {
      private Object b = new Object() {
          private String s = null;
  
          public String toString() {
              if (s == null) {
                  s = "q";
              }
              return "A";
          }
      };
  
  }
