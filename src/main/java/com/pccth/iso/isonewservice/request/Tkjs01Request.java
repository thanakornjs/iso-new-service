package com.pccth.iso.isonewservice.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tkjs01Request implements Serializable {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "name")
    private String name;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
