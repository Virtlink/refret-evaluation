test;
[p0] {
[Test]
    package p0;
  
  public class Test {
  	void m() {
  		new StringBuffer("hello").substring(1, 3);
  		new StringBuffer("hello").substring(1, 4);
  	}
  }
  
}
[p1] {
[Other]
    package p1;
  class Other {
			
  }
  
}
