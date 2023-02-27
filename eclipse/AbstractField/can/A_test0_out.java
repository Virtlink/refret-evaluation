test;
[p] {
[A]
    package p;
  class A{
  	private int [[@1|f]];
  	void m(){
  		int g= getF();
  	}
  	private int getF(){
  		return [[->1|f]];
  	}
  }
}
