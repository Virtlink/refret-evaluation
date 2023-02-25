test;
[TestSubclass]
    class TestSubclass extends Test {
    @Override
    boolean x() {
      return false;
    }
    @Override
    boolean y() {
      return true;
    }
  }
  
  abstract class X {
    abstract boolean x();
  }
  
  class Y extends X {
    @Override
    boolean x() {
      return true;
    }
  }
[Test]
    public abstract class Test extends X {
      abstract boolean y();
  }
  
