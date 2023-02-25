test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  public class A implements I {
  	public void m() {
          int[] array= { Integer.valueOf(1) };
  	}
  }
  
}
