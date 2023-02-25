test;
[a] {
[Test]
    package a;
  
  public class Test extends Sup {
      void foo(){}
  }
  
[Sup]
    package a;
  class Sup {}
}
[b] {
[TestSubclass]
    package b;
  
  import a.Test;
  
  public class TestSubclass  extends Test {
      }
}
