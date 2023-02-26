test;
[Test]
    
  class Test {
  
      String use(String[] list) {
      for(String str : list) {
          String s = str;
          if (s == null) break;
          s = s.trim();
          if (s.isEmpty()) break;
          int i;
          try {
            i = Integer.parseInt(s);
          }
          catch (NumberFormatException ex) {
              break;
          }
          if (i <= 0) {
              break;
          }
          System.out.println("Ok string: "+str);
      }
    }
  }
