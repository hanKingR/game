package com.minigame.www.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Show {

    private static final Logger LOG = Logger.getLogger(Show.class);

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object add(@PathVariable String token, @PathVariable String operation_id, @RequestBody String parameter) {
        LOG.info(" JSON =>>" + parameter);


        return "";
    }
}
