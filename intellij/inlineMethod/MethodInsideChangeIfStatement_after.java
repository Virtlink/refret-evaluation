test;
[Test]
    import java.util.ArrayList;
  import java.util.List;
  
  class Test {
    List<String> foo(String[] strs)
    {
      final List<String> result = new ArrayList<String>();
      int start = -1;
      for (int i = 0; i < strs.length; i++)
      {
          if (i == 42 && start == -1)
        {
          start = i;
        } else if (i != 24 && start != -1)
        {
            //c1
            result.add("".substring(start));
        }
      }
      return result;
    }
  
  }
