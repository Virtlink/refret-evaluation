test;
[SameVarMethodNames]
    class Test {
    public boolean isConsideredFinal(int cl) {
        return cl == cl();
    }
  
      int cl() {
      return 0;
    }
  }
