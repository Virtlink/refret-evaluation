test;
[p] {
[A]
    package p;
  class A {
  	int f(){
  		int temp= f();
  		int t= temp;
  		f();
  		return 1;
  	}
  }
  
}
