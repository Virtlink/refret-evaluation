test;
[p] {
[A]
    package p;
  class A{
  	private int [[@3|m]](
  	 int [[@1|j]],
  	 int [[@2|i]]){
  		return [[->3|m(1, m(j, i))]];
  	}
  }
}
