test;
[Test]
    class Test {
    void test(Object obj) {
      if (obj instanceof String) {
        System.out.println(((String) obj).trim());
      }
    }
  }
