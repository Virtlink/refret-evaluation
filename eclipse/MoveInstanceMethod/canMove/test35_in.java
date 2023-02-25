test;
[test1] {
[Test2]
    package test1;
  
  
  public class Test2 {
          public Test2() {
                  new Test1().methodToMove();
          }
  }
  
[Test1]
    package test1;
  public class Test1 {
          public void methodToMove() {}
          private TestTarget target;
          public TestTarget getTestTarget() { return target; }
  }
  
[TestTarget]
    package test1;
  public class TestTarget {}
  
  
}
