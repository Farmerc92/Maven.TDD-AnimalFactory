package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void dogConstructorTest(){
        String expectedName = "Snuffles";
        Date expectedDate = new Date();
        Integer expectedId = 1;


        Dog snuffles = new Dog(expectedName, expectedDate, expectedId);

        Assert.assertEquals(expectedName, snuffles.getName());
        Assert.assertEquals(expectedDate, snuffles.getBirthDate());
        Assert.assertEquals(expectedName, snuffles.getName());
    }

    @Test
    public void dogSpeakTest(){
        String expectedSpeak = "bark!";

        Dog barky = new Dog(null, null, null);

        Assert.assertEquals(expectedSpeak, barky.speak());
    }

    @Test
    public void setBirthDateTest(){
        Dog birthy = new Dog(null, null, null);
        Date expectedDate = new Date();
        birthy.setBirthDate(expectedDate);

        Assert.assertEquals(expectedDate, birthy.getBirthDate());
    }

    @Test
    public void eatTest(){
        Dog eaty = new Dog(null, null, null);
        Food dogFood = new Food();
        eaty.eat(dogFood);
        Integer expectedEaten = 1;

        Assert.assertEquals(expectedEaten, eaty.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        Integer expectedId = 3;
        Dog button = new Dog(null, null, expectedId);

        Assert.assertEquals(expectedId, button.getId());
    }

    @Test
    public void animalInheritanceTest(){
        Dog eric = new Dog(null, null, null);

        Assert.assertTrue(eric instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog joe = new Dog(null, null, null);

        Assert.assertTrue(joe instanceof Mammal);
    }
}
