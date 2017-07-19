
package org.divy.sonar.check.java;

import com.google.common.collect.ImmutableList;
import org.divy.sonar.check.java.generic.GenericLayerUsageCheck;
import org.divy.sonar.check.java.hybris.HybrisControllerDaoUsageCheck;
import org.divy.sonar.check.java.hybris.HybrisControllerModelUsageCheck;
import org.divy.sonar.check.java.hybris.HybrisControllerServiceUsageCheck;
import org.sonar.plugins.java.api.JavaCheck;

import java.util.List;

public final class RulesList {

  private RulesList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .add(HybrisControllerDaoUsageCheck.class)
      .add(HybrisControllerServiceUsageCheck.class)
      .add(HybrisControllerModelUsageCheck.class)
      .add(GenericLayerUsageCheck.class)
      .build();
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .build();
  }
}
