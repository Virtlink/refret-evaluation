test;
[I]
    interface I{}
[IImpl]
    class IImpl implements I{}
[U]
    import java.util.*;
  class U {
    public static void main(String[] args) {
      List<List<I>> l = new ArrayLits<List<I>>();
    }
  }
