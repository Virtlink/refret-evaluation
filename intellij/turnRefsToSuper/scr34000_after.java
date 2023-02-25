test;
[View]
    public class View {
      public View(Model model) {}
  }
[Main]
    public class Main {
      private static void install() {
          Model simpleModel = new SimpleModel();
          View view = new View(simpleModel);
      }
      public void foo() {
          Model simpleModel = new SimpleModel();
          simpleModel.doIt();
      }
  }
[SimpleModel]
    class SimpleModel extends Model {
  }
[Model]
    public class Model {
      public void doIt() {}
  }
