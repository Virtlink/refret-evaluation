test;
[SuggestChangeSignatureLeaveSameExpressionsUntouched]
    public class Test {
      {
          int x = 0;
  
          <selection>System.out.println("foo");
          System.out.println("bazz");
          System.out.println(x);</selection>
  
          System.out.println("bar");
          System.out.println("bazz");
          System.out.println(x);
      }
  }
