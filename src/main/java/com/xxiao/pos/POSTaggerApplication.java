package com.xxiao.pos;

import com.xxiao.pos.resources.TaggerResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

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
    bootstrap.addBundle(new ViewBundle());
  }

  @Override
  public void run(POSTaggerConfiguration configuration, Environment environment) throws Exception {
    this.applicationName = configuration.getApplicationName();

    environment.jersey().register(TaggerResource.class);
  }

  public static void main(String[] args) throws Exception {
    new POSTaggerApplication().run(args);
  }
}
