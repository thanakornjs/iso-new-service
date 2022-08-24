package com.pccth.iso.isonewservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pccth.iso.isonewservice.request.Tkjs01Request;
import com.pccth.iso.isonewservice.service.PersonService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("tkjs01")
public class Tkjs01Controller {

    @Autowired
    PersonService personService;

    // @GetMapping(value = "getPerson")
    // public Object getPerson(@ Tkjs01Request request) {
    // return "getPerson";
    // }

    @PostMapping(value = "postPerson")
    public Object postPerson(@RequestBody Tkjs01Request request) {

        return personService.savePerson(request);
    }

    @PutMapping(value = "putPerson")
    public String putPerson() {
        return "putPerson";
    }

    @DeleteMapping(value = "delPerson")
    public String delPerson() {
        return "delPerson";
    }

}
