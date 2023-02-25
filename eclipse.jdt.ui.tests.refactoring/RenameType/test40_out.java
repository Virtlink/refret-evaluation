test;
[p] {
[B]
    package p;
  //1 occurence
  public class B {
  }
  
  class C {
  	void m() {
  		class A{
  		}
  		new A();
  	}
  }
}
