test;
[UnusedReassignmentInLoop]
    public class UnusedReassignmentInLoop {
  
    public void test() {
      for(int i = 0; i < 3; i++) {
        String replacement = "foo";
          System.out.println(replacement);
  
        replacement = "bar";
      }
    }
  }
