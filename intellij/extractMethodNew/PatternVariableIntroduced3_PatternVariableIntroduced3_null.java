test;
[PatternVariableIntroduced3]
    class X {
      void test(Object obj) {
          if (<selection>obj instanceof String s && s.length() > 5</selection>) {
              System.out.println("found");
          }
      }
  }
