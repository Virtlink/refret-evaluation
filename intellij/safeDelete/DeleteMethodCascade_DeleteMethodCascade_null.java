test;
[DeleteMethodCascade]
    class Test {
      void f<caret>oo() {
          bar();
      }
  
      void bar(){
          baz();
      }
  
      void baz(){}
  }
