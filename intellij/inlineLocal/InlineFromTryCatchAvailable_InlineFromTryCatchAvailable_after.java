test;
[InlineFromTryCatchAvailable]
    import java.io.*;
  
  class Test {
      private static InputStream getInputUnchecked(InputStream inputSupplier) throws IOException {
          try {
          }
          catch (IOException e) {
              throw new IOException();
          }
          return null;
      }
  
  }
