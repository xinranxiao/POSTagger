package com.xxiao.pos;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.xxiao.pos.modules.POSModule;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by xxiao on 8/2/14.
 */
public class POSTaggerApplication extends Application<POSTaggerConfiguration> {
  private String applicationName;

  @Override
  public String getName() {
    return applicationName;
  }

  @Override
  public void initialize(Bootstrap<POSTaggerConfiguration> bootstrap) {
    GuiceBundle<POSTaggerConfiguration> guiceBundle = GuiceBundle.<POSTaggerConfiguration>newBuilder()
        .addModule(new POSModule())
        .enableAutoConfig(getClass().getPackage().getName())
        .setConfigClass(POSTaggerConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

  @Override
  public void run(POSTaggerConfiguration configuration, Environment environment) throws Exception {
    this.applicationName = configuration.getApplicationName();

  }

  public static void main(String[] args) throws Exception {
    new POSTaggerApplication().run(args);
  }
}
