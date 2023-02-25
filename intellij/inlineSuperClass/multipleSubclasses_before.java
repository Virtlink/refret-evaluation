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
[Test1]
    class Test1 extends Super{
    public void context() {
      super.method();
    }
  }
