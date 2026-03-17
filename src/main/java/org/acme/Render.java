package org.acme;

import io.quarkus.runtime.Startup;

public class Render {

  @Startup
  void onStart() {
    var hello = new MyImpl().hello().render();
    IO.println(hello);
  }
}
