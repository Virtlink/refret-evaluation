test;
[a] {
[Test]
    package a;
  
  public abstract class Test {
      abstract void x();
  }
  
}
[b] {
[E]
    package b;
  class E{}
[TestSubclass]
    package b;
  
  import a.Test;
  
  public class TestSubclass extends Test {
      @Override void x() {
      }
  }
}
