test;
[TestSubclass]
    public class TestSubclass<A, B extends Number> extends Test<A, B> {
  }
[Test]
    public class Test<A, B extends Number> {
      public B m(A a){return null;}
  }
  
