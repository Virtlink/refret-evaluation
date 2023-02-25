test;
[p] {
[A]
    package p;
  class A{
  	private void m(
  	 int [[1|j]],
  	 int [[2|i]]){
  		m(1 + 2, [[->2|i]]);
  	}
  }
}
