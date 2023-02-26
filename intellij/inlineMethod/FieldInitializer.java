test;
[Test]
    class A{
    int field = foo();
  
    int <caret>foo(){
      return 1;
    }
  }
  
