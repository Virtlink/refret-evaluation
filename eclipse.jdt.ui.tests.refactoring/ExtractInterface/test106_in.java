test;
[p] {
[B]
    package p;
  import java.util.ArrayList;
  public class B {
  	public static void main(String[] args) {
  		ArrayList<A> col = new ArrayList<A>();
  		for(A mytest : col) {
  			mytest.m1();
  		}
  	}
  }
[A]
    package p;
  
  public class A {
  	public void m1() {
  	}
  	public void m2() {
  	}
  }
}
