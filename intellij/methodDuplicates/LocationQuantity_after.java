test;
[Inner]
    class LocationQuantity {
    public final int myInt = 3;
  
    public int method(int p) {
      return myInt + p;
    }
  
    public void sameClassContext() {
      int v = 1;
      v++;
      int v2 = method(v);
      Object o = new Object() {
        public void anonymousClassContext() {
           int av = method(2);
        }
      };
    }
  
    public class Inner {
      private boolean myFlag;
      public int innerClassContext(int ip) {
        return myFlag ? method(ip) : 0;
      }
    }
  }
  
  class DifferentClass {
    private int myInt;
    private void differentClassContext() {
      LocationQuantity lq = new LocationQuantity();
      int v = lq.method(myInt);
    }
  }
  
