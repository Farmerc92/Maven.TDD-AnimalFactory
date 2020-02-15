package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String expectedName = "Sparky";
        Date expectedDate = new Date();
        Integer expectedId = 20;

        Dog sparky = new Dog(expectedName, expectedDate, expectedId);

        Assert.assertEquals(expectedName, sparky.getName());
        Assert.assertEquals(expectedDate, sparky.getBirthDate());
        Assert.assertEquals(expectedId, sparky.getId());
    }

    @Test
    public void createCatTest(){
        String expectedName = "Gary";
        Date expectedDate = new Date();
        Integer expectedId = 10;

        Cat gary = new Cat(expectedName, expectedDate, expectedId);

        Assert.assertEquals(expectedName, gary.getName());
        Assert.assertEquals(expectedDate, gary.getBirthDate());
        Assert.assertEquals(expectedId, gary.getId());
    }
}
