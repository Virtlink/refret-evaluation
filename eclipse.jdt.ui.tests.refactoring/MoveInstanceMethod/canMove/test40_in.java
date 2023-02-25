test;
[p] {
[B]
    package p;
  class B {
  	A[] participants;
  }
[A]
    package p;
  class A {
  	int id;
  	boolean participates(B p) {
  		return (p.participants[0].id == id);
      }
  }
}
