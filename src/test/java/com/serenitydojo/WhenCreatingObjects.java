package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        Cat spot = new Cat("Spot", "String", 5);

        Assert.assertEquals(spot.getName(), "Spot");
        Assert.assertEquals(spot.getFavoriteToy(), "String");
        Assert.assertEquals(spot.getAge(), 5);
    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void creating_a_hamster() {
        Hamster hazel = new Hamster("Hazel", "Wheel", 1);

        Assert.assertEquals(hazel.getName(), "Hazel");
        Assert.assertEquals(hazel.getFavoriteGame(), "Wheel");
        Assert.assertEquals(hazel.getAge(), 1);
    }

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido","Bone", 5);
        Pet spot = new Cat("Spot","String", 5);
        Pet hazel = new Hamster("Hazel", "Wheel", 1);

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }

}

