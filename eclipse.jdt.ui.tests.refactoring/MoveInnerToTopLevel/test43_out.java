test;
[p] {
[B]
    package p;
  class B {
  	public void execute() {
  		synchronized (B.this) {
  			System.err.println();
  		}
  	}
  }
[A]
    package p;
  public class A {
  }
}
