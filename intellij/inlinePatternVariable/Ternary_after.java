test;
[Test]
    class Test {
    void test(boolean b, Object o1, Object o2) {
      if (!((b ? o1 : o2) instanceof String)) return;
      System.out.println(((String) (b ? o1 : o2)).isEmpty());
      System.out.println(((String) (b ? o1 : o2)).trim().isEmpty());
    }
  }
