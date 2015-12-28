package home.learning.learnexamples;

import io.vertx.core.AbstractVerticle;

/**
 * @Author Matthew Eaton
 */
public class Main extends AbstractVerticle {

  @Override
  public void start() throws Exception {
     
      vertx.setPeriodic(3000, res -> {
      System.out.println("Periodic event triggered.");
      });
  }
}
