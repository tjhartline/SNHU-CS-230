package com.gamingroom;

public class Entity {

//set attributes to private
    private long id;
    private String name;

    //default constructor
    private Entity() {

    }
    //new constructor with id and name parameters
    //passed in.
    public Entity(long id, String name) {

        //call to default constructor
        this();
        this.id = id;
        this.name = name;
    }

    public long getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public String toString() {

        return "Entity [id = " + id + ", name = " + name + "]";

    }
}
