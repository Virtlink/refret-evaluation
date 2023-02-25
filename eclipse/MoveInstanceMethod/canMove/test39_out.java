test;
[p] {
[B]
    package p;
  class B {
  	A participant;
  
  	boolean participates(A a) {
  		return (participant.id == a.id);
  	}
  }
[A]
    package p;
  class A {
  	int id;
  }
}
