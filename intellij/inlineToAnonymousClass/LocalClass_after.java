test;
[Test]
    class A {
      public void test() {
    
          Object b = new Object() {
              public String toString() {
                  return "A";
              }
          };
      }
  }
