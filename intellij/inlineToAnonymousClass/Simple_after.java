test;
[Test]
    class A {
      private Object b = new Object() {
          public String toString() {
              return "A";
          }
      };
  
  }
