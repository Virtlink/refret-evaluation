test;
[Test]
    class Test {
    public Foo createFoo() {
          return new Foo() {
              public void bar() {
                  Test.bar();
              }
          };
      }
  
      public static void bar() {
          System.out.println(1);
      }
  
      public interface Foo {
          void bar();
      }
  }
