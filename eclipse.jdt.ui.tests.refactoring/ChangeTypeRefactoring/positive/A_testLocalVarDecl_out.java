test;
[A]
    import java.util.HashMap;
  import java.util.Map;
  import java.util.Properties;
  
  class A_testLocalVarDecl_in {
  	public static void main(String[] args) {
  		Map table = new Properties();
  		Map map = table;
  		table.put(table,table);
  		table.containsKey(map);
  		map = new HashMap();
  	}
  }
  
