test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  }
[X]
    package p;
  
  public class X implements I { }
  
[A]
    package p;
  
  public class A {
  	private void foo() {
  		I idealEndPos[][] = null;
  		I ideal[] = null;
  		ideal[2] = (false
  				? idealEndPos[3][2]
  								 : idealEndPos[2][1]);
  		int j = ideal.length;
  	}
  }
  
}
