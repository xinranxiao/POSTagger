package com.xxiao.pos;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by xxiao on 8/2/14.
 */
public class POSTaggerConfiguration extends Configuration {
  @NotEmpty
  private String applicationName = "POS Tagger";

  public String getApplicationName() {
    return applicationName;
  }
}
