test;
[Super]
    class Super {
    int i;
    Super() {
      this(1);
    }
    Super(int i) {
      this(i, 0);
    }
    Super(int i, int j) {
      this.i = i;
    }
  }
  
[Test]
    class Test extends Super{
    public Test() {
    }
  }
