package org.intellij.erlang.jps.model;

import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.ex.JpsElementTypeWithDummyProperties;
import org.jetbrains.jps.model.module.JpsModuleType;

public class JpsErlangModuleType extends JpsElementTypeWithDummyProperties implements JpsModuleType<JpsDummyElement> {
  public static final JpsErlangModuleType INSTANCE = new JpsErlangModuleType();

  private JpsErlangModuleType() {
  }
}
