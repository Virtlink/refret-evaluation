test;
[Test]
    class Test {
  
      String use(String s) {
          String s1 = s+s;
          if(s1 != null) {
            s1 = s1.trim();
            if (s1.isEmpty()) {
                throw new IllegalArgumentException();
            }
          }
          return "nice";
      }
  }
