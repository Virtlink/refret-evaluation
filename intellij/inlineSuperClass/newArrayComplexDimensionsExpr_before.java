test;
[Super]
    class Super {
    void foo() {
      Super s = new Super();
      s.bar();
    }
  
    static int bar(){return 1;}
  }
[Test]
    class Test extends Super{
  }
[Usage]
    class Usage {
    void ba() {
      Super[][] s = new Super[Super.bar()][];
    }
  }
