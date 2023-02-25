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
    Test(String s){}
  }
