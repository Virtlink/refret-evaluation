test;
[Test]
    class Test {
      public static final String [[@1|S]] = "";

      static void [[@2|foo]](){
         System.out.println(S);
      }

      void bar() {
      System.out.println([[->1|Super.S|Test.S]]);
      [[->2|Super.foo()|foo()]]; // Was Test.foo(), but our proposal is better
    }
  }
