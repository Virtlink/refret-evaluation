test;
[Test]
    class Outer {
      int i;
  
      void foo() {
          final int i = 0;
          new Object() {
              public void f() {
                  int j = Outer.this.i;
              }
          };
      }
  }
