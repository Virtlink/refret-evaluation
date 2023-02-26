test;
[Test]
    
  enum En {
    A() {
      {
        int str = un<caret>resolved;
      }
    };
  
  }
