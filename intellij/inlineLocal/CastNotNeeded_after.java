test;
[Test]
    class Test {
    static boolean isA() {
      return true;
    }
  
    static boolean isB() {
      return true;
    }
  
    private static void foo(final boolean explicit) {
        if (explicit ? isA() : isB()) {
      }
    }
  }
