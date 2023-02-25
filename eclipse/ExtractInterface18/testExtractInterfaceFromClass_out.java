test;
[p] {
[B]
    package p;
  
  /** typecomment template*/
  public interface B {
  
  	void m1(String s);
  
  }
[A]
    package p;
  
  public class A implements B {	
  
  	public void m1(String s) {
  		System.out.println(s);
  	}
  
  	public static void statictM1(String s) {
  		System.out.println(s);
  	}
  }
}
