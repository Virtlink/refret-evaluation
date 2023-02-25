test;
[Super]
    class Super {
    void foo() {
      Super s = new Super();
      s.bar();
    }
  
    void bar() {}
  }
[Test]
    class Test extends Super{
  }
[Usage]
    class Usage {
    void ba() {
      Super[][] s = new Super[2][3];
    }
  }
