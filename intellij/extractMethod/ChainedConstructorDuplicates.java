test;
[Test]
    class A {
      private int i;
      private int j;
      private int s;
  
      public A(int i, int j) {
          <selection>this.i = i;</selection>
          this.j = j;
      }
  
      public A(int i, String s) {
          this.i = i;
          this.s = s;
      }
  }
