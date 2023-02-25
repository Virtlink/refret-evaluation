test;
[p] {
[B]
    package p;
  class B {
  	A[] participants;
  
  	boolean participates(A a) {
  		return (participants[0].id == a.id);
  	}
  }
[A]
    package p;
  class A {
  	int id;
  }
}
