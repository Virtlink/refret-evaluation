test;
[Test]
    class A {
      boolean gg;
  }
  
  class B extends A {
      class FF {
          public void setGG(boolean gg) {
                  B.this.gg = gg;
              }
      }
  
  }
