test;
[I]
    interface I{}
[IImpl]
    class IImpl implements I{}
[U]
    import java.util.*;
  class U {
    public static void main(String[] args) {
      List<List<IImpl>> l = new ArrayLits<List<IImpl>>();
    }
  }
