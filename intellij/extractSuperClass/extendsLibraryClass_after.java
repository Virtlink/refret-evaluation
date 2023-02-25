test;
[TestSubclass]
    public class TestSubclass extends Test {
      public TestSubclass(int capacity) {
          super(capacity);
      }
  }
[Test]
    import java.util.ArrayList;
  
  public class Test extends ArrayList {
      public Test(int initialCapacity) {
          super(initialCapacity);
      }
  }
  
