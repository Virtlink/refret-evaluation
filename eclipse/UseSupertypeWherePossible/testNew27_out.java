test;
[p] {
[B]
    package p;
  public class B {
  	int field= 0;
  }
[A]
    package p;
  //use B
  class A extends B{
  	void f(B a){
  		a.field= 0;
  	}
  }
}
