test;
[p] {
[A]
    //5, 20 -> 5, 29   AllowLoadtime == false
  package p;
  class A {
  	private static final int CONSTANT= (2 + 3);
  
  	void f() {
  		int i= 1 - CONSTANT;
  	}
  }
}
