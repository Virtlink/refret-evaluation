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
  	public void m() {}
  	public void m1() {}
  }
}
