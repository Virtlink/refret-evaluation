test;
[Test]
    class Foo {
    void method() {
        new Bar().innerMethod();
    }
  }
  class Bar {
      Bar innerMethod() {
      return this;
    }
  }
