test;
[p] {
[A]
    package p;
  class A{
  	private int [[@1|m]](int j, int i){
  		return m(3, [[->1|m]](2, 1));
  	}
  }
}
