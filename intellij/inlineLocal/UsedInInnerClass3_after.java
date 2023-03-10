test;
[IDEA17606]
    public class IDEA17606 {
  
      public void foo() {
          // try to inline 'preferences'
          final Bar bar = new Bar(Preferences.getInstance().getComponent());
          bar.toString();
  
          ThreadUtils.run(new Runnable() {
              public void run() {
                  final Foo foo = new Foo();
                  foo.setSize(Preferences.getInstance().getDimension().getSize());
              }
          });
      }
  
      class Preferences {
  	public static Preferences getInstance() {
              return new Preferences();
          }
  
  	public JComponent getComponent() {
              return null;
          }
  
  	public Dimension getDimension() {
              return null;
  	}
      }
  
      class Bar {
  	public Bar(JComponent component) {
  	}
      }
  
      class ThreadUtils {
          public static void run(Runnable runnable) {
          }
      }
  }
  
