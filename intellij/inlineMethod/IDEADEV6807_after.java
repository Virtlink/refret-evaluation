test;
[Test]
    class Base {
      protected int [[1|f]];


  }

  class DRV extends Base {
      void f() {
          int f1 = [[->1|f]];
      }
  }

