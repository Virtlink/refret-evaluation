test;
[p] {
[C]
    package p;
  class C{
  	void k(){
  		new A().m(4);
  	}
  }
[A]
    //renaming B.m to kk
  package p;
  class B {
  	private void kk(int m) {
  	}
  
  }
  public class A extends B {
  	void m(int m) {
  	}
  }
}
