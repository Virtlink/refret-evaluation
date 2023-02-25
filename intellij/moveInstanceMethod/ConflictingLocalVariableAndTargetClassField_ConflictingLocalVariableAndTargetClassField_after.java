test;
[ConflictingLocalVariableAndTargetClassField]
    
  import java.util.ArrayList;
  import java.util.List;
  
  class Data {
      final List<Datum> datums;
  
      Data(List<Datum> datums) {
          this.datums = datums;
      }
  
      public List<Datum> filter() {
          List<Datum> datums = new ArrayList<>();
          for (Datum datum : this.datums) {
              if (datum != null) datums.add(datum);
          }
          return datums;
      }
  
      static class Datum { }
  }
  
  class DataUser {
  }
