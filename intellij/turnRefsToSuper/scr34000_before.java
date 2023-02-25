test;
[View]
    public class View {
      public View(Model model) {}
  }
[Main]
    public class Main {
      private static void install() {
          SimpleModel simpleModel = new SimpleModel();
          View view = new View(simpleModel);
      }
      public void foo() {
          SimpleModel simpleModel = new SimpleModel();
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
