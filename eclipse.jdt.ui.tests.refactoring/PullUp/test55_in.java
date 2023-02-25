test;
[p] {
[B]
    package p;
  
  class B extends A {
  	public int k= 1;
  }
  
[C]
    package p;
  
  class C extends B {
  	public int k= 2;
  
  	public int test() {
  		return k;
  	}
  }
  
[A]
    package p;
  
  class A {
  }
  
}
