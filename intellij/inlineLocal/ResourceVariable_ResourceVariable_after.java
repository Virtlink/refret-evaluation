test;
[ResourceVariable]
    class Test {
    void m() throws Exception {
        try (AutoCloseable r2 = null) {
          System.out.println(null + ", " + r2);
        }
    }
  }
