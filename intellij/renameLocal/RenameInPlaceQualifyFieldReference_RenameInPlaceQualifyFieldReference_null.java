test;
[RenameInPlaceQualifyFieldReference]
    class Test {
    int myI;
    void foo(int <caret>i){
      myI = i;
    }
  }
