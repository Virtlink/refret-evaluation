test;
[XXX]
    public class XXX extends Base {
    int x = 5;
  
    public void context() {
        new Object() {
            private void InnerClass() {
                int a = XXX.this.x;
                int b = XXX.super.y;
            }
        }.InnerClass();
    }
  }
  
  class Base {
    int y = 7;
  }
  
