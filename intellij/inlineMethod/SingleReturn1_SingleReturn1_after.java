test;
[SingleReturn1]
    class Tester {
      // IDEA-37432
  
      void caller(String v) {
          String g = null;
          if (v != null) {
              g = v;
          }
          System.out.println(g);
      }
  }
  
