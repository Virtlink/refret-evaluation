test;
[Super]
    class Super {
    Super(String s){}
  
    void foo() {
      Super s = new Super("");
      s.bar();
    }
  
    void bar() {}
  }
[Test]
    class Test extends Super{
    Test(String s, String s1){super(s);}
  }
