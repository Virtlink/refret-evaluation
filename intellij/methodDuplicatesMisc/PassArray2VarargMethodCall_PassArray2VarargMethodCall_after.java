test;
[PassArray2VarargMethodCall]
    class Test {
    public void printArray(String... p) {
      System.out.println(p[0]);
      System.out.println(p[1]);
    }
  
    public void doSmth() {
      String[] arr = {"smth1", "smth2", "smth3"};
        printArray(arr);
    }
  
  }
