test;
[Test]
    class A {
  }
  
  class B {
      public void test() {
          Object inner = new Object() {
              private void a() {
              }
  
              private void b() {
              }
  
              class InnerA {
              }
  
              class InnerB {
              }
          };
      }
  }
