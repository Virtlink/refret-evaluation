test;
[ExpData]
    import java.util.*;
  
  public class ExpData {
     private final List<Integer> myResult = new ArrayList<Integer>();
    {
      m(10);
    }
  
    private void m(int i) {
      if (i > 0) {
        m(i - 1);
      }
      myResult.add(i);
    }
  }
  
