test;
[IDEADEV950]
    public class IDEADEV950 {
      void foo () {
          int door_1 =  0;
          //Cast should be inserted when inlining, otherwise semantics changes
          float d1 = ((float) door_1 / NOF_LOOPS);
      }
  
      private static final int NOF_LOOPS = 2;
  }
  
