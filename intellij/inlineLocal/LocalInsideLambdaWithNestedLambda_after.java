test;
[Test]
    class Foo {
      void foo(String s) {
          Runnable r = () -> {
              Runnable r2 = () -> System.out.println(s.toString());
          };
      }
  }
  
