test;
[BooleanModelIfElse2]
    class Test {
  
      String useTest() {
          for(int i=0; i<10; i++) {
            if (Math.random() > 0.5) return "foo".trim();
          }
          return "bar".trim();
      }
  }
