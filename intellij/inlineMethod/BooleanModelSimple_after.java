test;
[Test]
    class Test {
  
      void use(String s) {
          String s1 = s+s;
          if(s1 != null) {
            s1 = s1.trim();
            if (s1.isEmpty()) {
                throw new IllegalArgumentException();
            }
          }
          System.out.println("woohoo");
    }
  }
