test;
[Super]
    class Super {
    public static final String [[1|CONST]] = "CONST";
  }

[Test]
    abstract class Test extends Sup<caret>er {
      public static final String [[2|CONST]] = "CONST";

      {
      System.out.println(CONST);
      System.out.println([[->2|Super.CONST|Test.CONST]]);   // TODO: Context
    }
  }
  abstract class Test1 extends Super {
    {
      System.out.println(CONST);
      System.out.println([[->1|Super.CONST|Super.CONST]]);
    }
  }
  abstract class Test2{
    System.out.println([[->1|Super.CONST|Super.CONST]]);
  }
