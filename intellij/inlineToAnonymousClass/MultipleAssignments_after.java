test;
[Test]
    class Usage {
    private Object wc1 = new Object() {
        private int myInt = 8;
        private String myString = "Sashya";
  
        {
            int i = 2;
            i = 3;
            myInt = i + 17;
            int j = 4;
            j = 5;
            myString = "Sa".substring(j);
        }
    };
  }
