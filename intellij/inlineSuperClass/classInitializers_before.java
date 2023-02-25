test;
[Super]
    class Super {
    {
      System.out.println("instance");
    }
  
    static {
      System.out.println("static");
    }
  }
[Test]
    class Test extends Super{
    void foo() {
      Super s = new Super();
    }
  }
