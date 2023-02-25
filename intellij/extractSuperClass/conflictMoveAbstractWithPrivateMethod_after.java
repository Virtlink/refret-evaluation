test;
[TestSubclass]
    public class TestSubclass extends Test {
      @Override
      void x() {
        xx();
      }
  
  }
[Test]
    public abstract class Test {
      abstract void x();
  
      private void xx(){}
  }
  
