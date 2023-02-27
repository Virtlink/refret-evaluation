test;
[p] {
[A]
    package p;
  class A{
  	private void m(int [[@1|i]], int [[@2|j]]){
  		m([[->1|i]], [[->2|j]]);
  	}
  }
}
