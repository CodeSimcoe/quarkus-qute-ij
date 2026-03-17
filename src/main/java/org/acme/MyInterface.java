package org.acme;

import io.quarkus.qute.TemplateInstance;

public sealed interface MyInterface permits MyImpl {
  TemplateInstance hello();
}
