test;
[p] {
[B]
    package p;
  import java.util.ArrayList;
  public class B {
  	public static void main(String[] args) {
  		ArrayList<A> col = new ArrayList<A>();
  		for(I mytest : col) {
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
