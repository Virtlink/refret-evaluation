test;
[BaseClass]
    public class BaseClass extends JComponent {
  }
  
  class SubClass extends BaseClass {
   void a() {
       Util.method(SubClass.this);
   }
  }
  
  class Util {
   public static void method(BaseClass base) {
    System.out.println(base.getLocation());
   }
  }
  
