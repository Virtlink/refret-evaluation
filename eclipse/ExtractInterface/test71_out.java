test;
[p] {
[As]
    package p;
  /** typecomment template*/
  public class As {
  	void f(){
  		I a= new A();
  		if (a instanceof A){
  		} else {
  		}
  	}
  }
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
