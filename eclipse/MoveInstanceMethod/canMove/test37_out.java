test;
[p] {
[B]
    package p;
  class B {
      public String value;
  
  	public void methodToMoveToDestination(A a, String value) {
  	    this.value = value;
  	    this.value = value;
  	}
  }
[A]
    package p;
  class A {
      B destination = new B();
  }
}
