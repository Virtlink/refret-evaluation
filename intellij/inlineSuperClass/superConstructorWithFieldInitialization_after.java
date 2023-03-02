test;
[Test]
    class Test {
      private final String [[@1|field]];

      Test(){
          [[->1|field|field]] = "text"; // Was `Test.this.field`, but our proposal is better.
      }
  }
