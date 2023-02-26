test;
[Test]
    interface I {}
  class Test {}
  class C {
    {
      Test a = new Test() {};
    }
  }
