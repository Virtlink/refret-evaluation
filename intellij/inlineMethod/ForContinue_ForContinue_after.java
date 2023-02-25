test;
[ForContinue]
    import java.util.*;
  
  class AAA {
      private void foo(List<String> list) {
          for (String val : list) {
              if (val == null) continue;
              val = val.trim();
              if (val.isEmpty()) continue;
              try {
                  Integer.parseInt(val);
              } catch (NumberFormatException e) {
                  continue;
              }
              throw new IllegalArgumentException("Should not be a number!");
          }
      }
  
  }
