test;
[Test]
    class A {
      public void usage() {
          int[] [[@1|array]] = new int[150];
          for (int i = 0; i < array.length; i++) {
              System.out.println([[->1|array]][i]);
          }
      }
  }
