test;
[Super]
    class Super {
    Super(String s) {
      if (s == null) return;
      System.out.println("s:" + s);
    }
  
    void foo() {
      Super s = new Super(null);
      s.bar();
    }
  
    void bar() {}
  }
[Test]
    class Test extends Super{
    Test(String s){
      super(s);
      System.out.println("hello");
    }
  
  }
