test;
[test2] {
[Test2]
    package test2;
  
  import test1.Test1;
  
  public class Test2 {
          public Test2() {
                  new Test1().target.methodToMove();
          }
  }
  
}
[test1] {
[Test1]
    package test1;
  public class Test1 {
          public TestTarget target;
          public TestTarget getTestTarget() { return target; }
  }
  
[TestTarget]
    package test1;
  public class TestTarget {
  
  	public void methodToMove() {}}
  
  
}
