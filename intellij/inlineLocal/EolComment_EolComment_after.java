test;
[EolComment]
    import java.util.*;
  
  public class UnusedReassignmentInLoop {
  
    static String test(Deque<String> deque) {
        // comment
        return deque.isEmpty() ? null : deque.peek();
    }
  }
