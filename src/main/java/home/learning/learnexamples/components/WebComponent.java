/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.learning.learnexamples.components;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;

/**
 *
 * @author eatonm1
 */
public class WebComponent extends AbstractVerticle{
    @Override
    public void start(Future<Void> fut){
        HttpServer server = vertx.createHttpServer();
        
        server.requestHandler(r -> {
          r.response().end("<h1>WebComponent verticle running in a" +
              " Vert.x 3 application</h1>");
        });
        
        server.listen(8080, result ->{
        if(result.succeeded()){
            System.out.println("--- Start up complete and running ---");
            fut.complete();
        }else{
            fut.fail(result.cause());
        }
        });
    }
}
