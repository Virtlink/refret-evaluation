test;
[placeOutsideLoopAndRename]
    class C {
    {
      Runnable r = () ->  System.out.println("extrac<caret>t me");
    }
  }
