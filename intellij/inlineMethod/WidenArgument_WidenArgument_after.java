test;
[WidenArgument]
    class UnnecessaryDoubleCast {
    public void check() {
        assertDoubleEquals(25, 25.49);
    }
  
      public static void assertDoubleEquals(double v, double v2) {
    }
  }
