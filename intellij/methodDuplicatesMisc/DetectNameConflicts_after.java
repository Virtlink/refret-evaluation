test;
[Test]
    class Test {
    public Foo createFoo() {
          return new Foo() {
              public void bar() {
                  Test.this.bar();
              }
          };
      }
  
      public void bar() {
          System.out.println(1);
      }
  
      public interface Foo {
          void bar();
      }
  }
