test;
[Test]
    class Test {
      private final String [[@1|field]];

      Test(){
          [[->1|field|Test.this.field]] = "text";
      }
  }
