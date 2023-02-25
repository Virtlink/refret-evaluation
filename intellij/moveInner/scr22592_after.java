test;
[xxx] {
[Inner]
    package xxx;
  
  class Inner {
      private final Outer outer;
  
      public Inner(Outer outer) {
          this.outer = outer;
      }
  }
  
[Outer]
    package xxx;
  class Outer {
  
      {
          Object o = new Inner;
      }
  }
}
