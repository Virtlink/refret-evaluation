test;
[DontOpenMultidimensionalArrays]
    import java.util.Arrays;
  import java.util.List;
  
  class Main {
  
    public static void main(String[] args) {
        List<Object[]> l1 = Arrays.asList(new Object[][]{{""}, {""}});
    }
  }
  
