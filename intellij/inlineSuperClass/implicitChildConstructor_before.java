test;
[Super]
    class Super {
    Super(){}
  }
[Test]
    class Test extends Super{
    void foo() {
      Super s = new Super();
    }
  }
