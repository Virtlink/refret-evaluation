test;
[Super]
     class Super {
    protected final Object myBar;
    protected final Object myBizz;
  
    protected Super() {
      myBar = new Object() {
      };
      myBizz = null;
    }
  }
  
[Test]
    class Test extends Super{
    public Test() {
    }
  }
