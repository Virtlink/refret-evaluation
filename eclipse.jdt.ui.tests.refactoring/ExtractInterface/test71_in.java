test;
[p] {
[As]
    package p;
  /** typecomment template*/
  public class As {
  	void f(){
  		A a= new A();
  		if (a instanceof A){
  		} else {
  		}
  	}
  }
[A]
    package p;
  
  public class A {
  	public void m() {}
  	public void m1() {}
  }
}
