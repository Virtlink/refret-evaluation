test;
[Test]
    class X {
      void bar(String str){
          foo(str);
      }
  
      void foo(String str) {
        System.out.println(str);
        System.out.println(str.substring(0));
      }
  }
