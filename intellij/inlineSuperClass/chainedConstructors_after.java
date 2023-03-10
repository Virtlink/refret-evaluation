test;
[Test]
    class [[@type|Test]] {
      int i;

      public [[@cons1|Test]]() {
          [[->cons3| this(1) ]];
      }

      [[@cons2|Test]](int i, int j) {
        this.i = i;
      }

      [[@cons3|Test]](int i) {
        [[->cons2|this(i, 0);]]
      }
  }
