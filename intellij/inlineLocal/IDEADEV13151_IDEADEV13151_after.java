test;
[IDEADEV13151]
    class Tester {
      void method(String x, String... y) {
      }
  
      void method1(String x, String[] y) {
      }
  
      void caller() {
          method("", "a", "b");
          method1("", new String[]{"a", "b"});
      }
  }
