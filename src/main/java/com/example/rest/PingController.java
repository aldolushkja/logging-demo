package com.example.rest;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.MDC;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

@Path("/ping")
public class PingController {

    @Inject
    Logger LOG;

    @GET
    public Response ping(){
        MDC.put("correlationId", DigestUtils.sha1Hex(UUID.randomUUID().toString()));
        LOG.debug("This is a DEBUG message");
        LOG.info("This is a INFO message");
        LOG.trace("This is a TRACE message");
        LOG.warn("This is a WARN message");
        LOG.error("This is a ERROR message");

        return Response.ok("Check the logs to see what happened...").build();
    }
}
