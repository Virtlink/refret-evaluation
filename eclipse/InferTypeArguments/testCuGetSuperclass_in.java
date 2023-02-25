test;
[p] {
[A]
    package p;
  
  class TestSuite {
  	public TestSuite(Class theClass) {
  		theClass = theClass.getSuperclass();
  	}
  }
}
