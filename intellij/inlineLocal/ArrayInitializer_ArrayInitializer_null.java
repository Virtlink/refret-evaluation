test;
[ArrayInitializer]
    class Test {
  
    String[] get(){
      String[] to<caret>Inline = {""};
      return toInline;
    }
  }
