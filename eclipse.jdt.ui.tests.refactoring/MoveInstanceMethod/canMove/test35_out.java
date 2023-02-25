test;
[test1] {
[Test2]
    package test1;
  
  
  public class Test2 {
          public Test2() {
                  new Test1().target.methodToMove();
          }
  }
  
[Test1]
    package test1;
  public class Test1 {
          TestTarget target;
          public TestTarget getTestTarget() { return target; }
  }
  
[TestTarget]
    package test1;
  public class TestTarget {
  
  	public void methodToMove() {}}
  
  
}
