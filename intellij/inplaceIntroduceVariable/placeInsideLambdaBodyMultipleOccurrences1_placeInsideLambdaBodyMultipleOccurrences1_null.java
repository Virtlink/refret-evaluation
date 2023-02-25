test;
[placeInsideLambdaBodyMultipleOccurrences1]
    class Test {
    {
      Runnable r = () -> System.out.println("<caret>" + "");
    }
  }
