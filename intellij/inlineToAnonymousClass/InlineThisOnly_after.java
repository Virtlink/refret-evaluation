test;
[Test]
    class A {
      private Inner b = new Object() {
          public String toString() {
              return "A";
          }
      };
      private Inner b2 = new Inner();
  
      private class Inner {
          public String toString() {
              return "A";
          }
      }
  }
