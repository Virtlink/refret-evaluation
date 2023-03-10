test;
[Test]
    import java.io.File;
  
  class Main {
      String getParent(String path) {
          if (path == null) {
              throw new NullPointerException();
          }
          String path1 = fs.normalize(path);
          int prefixLength = fs.prefixLength(path1);
          int index = path1.lastIndexOf(File.separatorChar);
          if (index < prefixLength) {
              if ((prefixLength > 0) && (path1.length() > prefixLength))
                  return path1.substring(0, prefixLength);
              return null;
          }
          return path1.substring(0, index);
      }
  }
  
