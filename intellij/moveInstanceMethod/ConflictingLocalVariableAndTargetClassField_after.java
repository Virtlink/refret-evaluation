test;
[Test]

  import java.util.ArrayList;
  import java.util.List;

  class Data {
      final List<Datum> [[@1|datums]];

      Data(List<Datum> datums) {
          this.datums = datums;
      }

      public List<Datum> filter() {
          List<Datum> datums = new ArrayList<>();
          for (Datum datum : [[->1|datums|this.datums]]) {
              if (datum != null) datums.add(datum);
          }
          return datums;
      }

      static class Datum { }
  }

  class DataUser {
  }
