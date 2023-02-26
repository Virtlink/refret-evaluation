test;
[Test]
    import org.jetbrains.annotations.NotNull;
  
  public class Test {
  
    void test() {
        Result result = getResult();
  
        System.out.println("Point(" + result.x + ", " + result.y + ")");
    }
  
      @NotNull
      private static Result getResult() {
          int x = 0;
          int y = 0;
          System.out.println();
          Result result = new Result(x, y);
          return result;
      }
  
      private static class Result {
          public final int x;
          public final int y;
  
          public Result(int x, int y) {
              this.x = x;
              this.y = y;
          }
      }
  }
