test;
[Test]
    /*
  * Copyright 2000-2011 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
  interface Test {
    void foo(Param param, String... v);
  }
  
  class TestImpl implements Test {
    @Override
    public void foo(Param param, String... v) {
    }
  
    void bar(){
       foo(new Param("a", "b"), "c");
       foo(new Param("a", "b"));
       foo(new Param("a", "b"), "c", "d");
     }
  }
[Param]
    public record Param(String a, String b) {
  }
