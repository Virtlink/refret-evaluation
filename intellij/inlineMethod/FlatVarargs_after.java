test;
[Test]
    class Varargs {
    void xxx() {
        bar(new String[] {"aa", "hh"});
    }
  
      void bar(String s, String ss){
  
    }
  
    void bar(String... ss) {
    }
  }
