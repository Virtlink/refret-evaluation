test;
[p] {
[A]
    package p;
  class A{
  	private int [[@3|m]](
  	 int [[@1|j]],
  	 int [[@2|i]]){
  		return m(1, [[->3|m(j, i)]]);
  	}
  }
}
