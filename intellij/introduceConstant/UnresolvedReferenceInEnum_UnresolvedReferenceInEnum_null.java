test;
[UnresolvedReferenceInEnum]
    
  enum En {
    A() {
      {
        int str = un<caret>resolved;
      }
    };
  
  }
