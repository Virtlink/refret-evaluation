test;
[Test]
    interface SAM<X> {
          X m(int i, int j);
      }
  
  class Foo {  
      void test() {
          m((i, j)->i + j);
      }
      void m(SAM<Integer> s) { }
  }
