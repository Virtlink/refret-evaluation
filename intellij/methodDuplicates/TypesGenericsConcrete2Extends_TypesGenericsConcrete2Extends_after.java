test;
[TypesGenericsConcrete2Extends]
    import java.util.ArrayList;
  import java.util.List;
  
  class Types {
      public void method(List<? extends List> v) {
          int i = v.get(0).getX();
      }
      public void context() {
          List<ArrayList> list = new ArrayList<ArrayList>();
          method(list);
      }
  }
  
