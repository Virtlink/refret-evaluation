test;
[Test]
    class Tester {
      // IDEA-37432
  
      void caller(String v) {
          String result = null;
          if (v != null) {
              result = v;
          }
          String g = result;
          Runnable r = () -> System.out.println(g);
      }
  }
  
