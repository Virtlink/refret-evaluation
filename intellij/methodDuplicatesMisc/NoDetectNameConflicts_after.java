test;
[Test]
    class Test {
    public Foo createFoo() {
          return new Foo() {
              public void bar() {
                  bar(1);
              }
          };
      }
  
      public void bar(int i) {
          System.out.println(i);
      }
  
      public interface Foo {
          void bar();
      }
  }
