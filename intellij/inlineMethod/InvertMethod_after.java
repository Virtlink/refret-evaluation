test;
[Test]
    
  class Test {
  
      boolean use(String s) {
          String s1 = s + s;
          if (s1 == null) return true;
          s1 = s1.trim();
          if (s1.isEmpty()) return true;
          return s1.length() % 2 != 0;
      }
  }
