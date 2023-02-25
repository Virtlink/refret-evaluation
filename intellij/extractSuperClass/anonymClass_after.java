test;
[TestSubclass]
    public abstract class TestSubclass implements Runnable {
  }
  
[Test]
    public abstract class Test {
    Runnable r =  new TestSubclass() {};
  }
