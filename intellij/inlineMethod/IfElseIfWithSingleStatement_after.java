test;
[Test]
    class Temp {
      public static void main(String... args) {
          if (args.length > 0) {
              if (args[0].equals("foo"))
                  System.out.println("bar");
          }
          else
              System.out.println("help");
      }
  
      private static void checkArgs(String[] args) {
          if (args[0].equals("foo"))
              System.out.println("bar");
      }
  }
