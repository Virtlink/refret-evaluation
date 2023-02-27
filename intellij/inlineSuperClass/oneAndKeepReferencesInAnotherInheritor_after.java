test;
[Super]
    class [[@4|Super]] {
    public static final String [[@1|CONST]] = "CONST";
  }

[Test]
    abstract class [[@3|Test]] extends Super {
      public static final String [[@2|CONST]] = "CONST";

      {
      System.out.println(CONST);
      System.out.println([[->2|&3|Super.CONST|Test.CONST]]);
    }
  }
  abstract class Test1 extends Super {
    {
      System.out.println(CONST);
      System.out.println([[->1|&4|Super.CONST|Super.CONST]]);
    }
  }
  abstract class Test2{
    System.out.println([[->1|&4|Super.CONST|Super.CONST]]);
  }
