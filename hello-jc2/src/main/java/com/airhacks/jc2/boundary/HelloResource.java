package com.airhacks.jc2.boundary;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("hello")
public class HelloResource {

    @Inject
    Instance<String> greeting;

    @GET
    public String hello() {
        return greeting.get();
    }

}
