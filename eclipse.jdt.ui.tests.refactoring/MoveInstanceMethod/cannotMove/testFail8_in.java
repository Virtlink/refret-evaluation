test;
[p2] {
[B]
    package p2;
  
  public class B {}
}
[p1] {
[A]
    package p1;
  
  import p2.B;
  
  public class A {
  	public synchronized int m(B b) {
  		return 0;
  	}	
  }
}
