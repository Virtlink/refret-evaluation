test;
[p] {
[B]
    package p;
  class B {
  	A participant;
  }
[A]
    package p;
  class A {
  	int id;
  	boolean participates(B p) {
  		return (p.participant.id == id);
      }
  }
}
