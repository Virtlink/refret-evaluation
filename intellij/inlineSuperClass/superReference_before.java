test;
[Super]
    class Super {
     public void method() {}
  }
[Test]
    class Test extends Super{
    public void context() {
      super.method();
    }
  }
