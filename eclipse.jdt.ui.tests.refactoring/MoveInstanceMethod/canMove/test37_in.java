test;
[p] {
[B]
    package p;
  class B {
      public String value;
  }
[A]
    package p;
  class A {
      B destination = new B();
      public void methodToMoveToDestination(String value) {
          this.destination.value = value;
          destination.value = value;
      }
  }
}
