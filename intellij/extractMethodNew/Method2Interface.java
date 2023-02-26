test;
[Test]
    interface I {
      default void foo () {
          <selection>System.out.println("hello");</selection>
      }
  }
