test;
[p] {
[B]
    package p;
  
  public class B {
  	public static void main(String[] args) {
  		I[] arr = new I[5];
  		for(I mytest : arr) {
  			mytest.m1();
  		}
  	}
  }
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	void m1();
  
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
