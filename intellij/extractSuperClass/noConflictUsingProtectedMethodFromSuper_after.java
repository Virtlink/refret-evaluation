test;
[TestSubclass]
    public class TestSubclass extends Test {
  }
[Test]
    import java.util.ArrayList;
  
  public class Test extends ArrayList {
      void x() {
        removeRange(0, 0);
      }
  }
  
