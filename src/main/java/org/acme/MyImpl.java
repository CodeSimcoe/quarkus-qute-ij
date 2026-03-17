package org.acme;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

@CheckedTemplate(basePath = "SUBDIR")
public final class MyImpl implements MyInterface {

  public static native TemplateInstance subHello(String name);

  @Override
  public TemplateInstance hello() {
    return subHello("Stuff");
  }
}
