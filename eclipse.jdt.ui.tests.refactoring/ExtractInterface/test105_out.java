test;
[p] {
[B]
    package p;
  
  public class B {
  	public static void main(String[] args) {
  		A[] arr = new A[5];
  		for(A mytest : arr) {
  			mytest.m1();
  		}
  	}
  }
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	void m2();
  
  }
[A]
    package p;
  
  public class A implements I {
  	public void m1() {
  	}
  	public void m2() {
  	}
  }
}
