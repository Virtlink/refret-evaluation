test;
[p] {
[B]
    package p;

  class B extends S{
      private final A a;

      public B(A [[@2|a]]) {
      super([[->1|&2|A.this.foo()|a.foo()]]);
          this.a = a;
      }
  }

[S]
    package p;

  class S {
    public S(int i){}
  }
[A]
    package p;

  class A {
      int [[@1|foo]](){}
  }
}
