test;
[Test]
    // IDEA-305008
  class X {
      public static String tr(String value) {
          if (hide() && value != null && !value.isEmpty()) {
              if (value.length() >= 2) {
                  return value.substring(0, 2) + "...";
              }
          }
          return value;
      }
  
      private static boolean hide() {
          return Math.random() > 0.5;
      }
  }
