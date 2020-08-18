package Application;

import Resource.HelloWordResource;
import Resource.WelcomeResource;
import configrations.HelloWorldConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfig> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    public void run(HelloWorldConfig configuration, Environment environment) throws Exception {
    environment.jersey().register(new HelloWordResource());
    environment.jersey().register(new WelcomeResource());
    }
}
