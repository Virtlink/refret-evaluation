test;
[Client]
    class Client {
      void method() {
          <selection>PairProvider.getPair()</selection>
      }
  }
[PairProvider]
    import util.Pair;
  
  class PairProvider {
      public static Pair<String, Pair<Integer, Boolean>> getPair() {
          return null;
      }
  }
[util] {
[Pair]
    package util;
  
  class Pair<L,R> {
      public Pair(L l, R r) {
  
      }
      public L getL() {
          return null;
      }
      public R getR() {
          return null;
      }
  }
}
