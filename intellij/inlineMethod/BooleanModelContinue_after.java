test;
[Test]
    
  class Test {
  
      String use(String[] list) {
      for(String str : list) {
          String s = str;
          if(s != null) {
            s = s.trim();
            if (s.isEmpty()) {
                continue;
            }
          }
          System.out.println("Ok string: "+str);
      }
    }
  }
