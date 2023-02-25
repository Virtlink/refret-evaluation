test;
[p] {
[SomeInner]
    package p;
  final class SomeInner {
  	SomeInner() {}
  	private SomeInner(String unused) {}
  	void usedMethod() {}
  	private void unusedMethod() {}
  }
[A]
    package p;
  
  public class A {
  
  	void usage() {
  		SomeInner c= new SomeInner();
  		c.usedMethod();
  	}
  }
}
