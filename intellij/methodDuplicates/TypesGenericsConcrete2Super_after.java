test;
[Test]
    import java.util.ArrayList;
  import java.util.List;
  
  class Types {
      public void method(List<? super JComponent> v) {
          Object o = v.get(0);
      }
      public void context() {
          List<Component> list = new ArrayList<Component>();
          method(list);
      }
  }
  class JComponent extends Component {}
  class Component {}
