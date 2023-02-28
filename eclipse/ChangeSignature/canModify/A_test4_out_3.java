test;
[p] {
[A]
    package p;
  class A{
  	private int [[@3|m]](
  	 int [[@1|j]],
  	 int [[@2|i]]){
  		return m(1, m([[->1|j]], [[->2|i]])); // splitsen
  	}
  }
}
