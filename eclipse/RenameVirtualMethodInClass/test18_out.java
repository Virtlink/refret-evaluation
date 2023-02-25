test;
[p] {
[C]
    package p;
  class C{
  	void k(){
  		new A().kk(4);
  	}
  }
[A]
    //renaming B.m to kk
  package p;
  class B {
  	void kk(int m) {
  	}
  
  }
  public class A extends B {
  	void kk(int m) {
  	}
  }
}
