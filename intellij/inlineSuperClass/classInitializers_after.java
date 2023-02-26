test;
[Test]
    class [[type|Test]] {
      static {
        System.out.println("static");
      }

      {
        System.out.println("instance");
      }

      void foo() {
      [[->type|Test]] s = new Test();
    }
  }
