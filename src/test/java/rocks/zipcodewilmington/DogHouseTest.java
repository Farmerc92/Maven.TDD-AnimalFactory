package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

        Integer expectedDogs = 1;

        Assert.assertEquals(expectedDogs, DogHouse.getNumberOfDogs());
        DogHouse.clear();
    }

    @Test
    public void addTest(){
        String name = "Butters";
        Date birthdate = new Date();
        Integer id = 1;

        Dog butters = new Dog(name, birthdate, id);

        DogHouse.add(butters);

        Assert.assertEquals(butters, DogHouse.getDogById(1));
        DogHouse.clear();
    }

    @Test
    public void removeIdTest(){
        String name = "Bob";
        Date birthdate = new Date();
        Integer id = 2;

        Dog bob = new Dog(name, birthdate, id);

        DogHouse.add(bob);
        DogHouse.remove(2);

        Assert.assertEquals(null, DogHouse.getDogById(2));
        DogHouse.clear();
    }

    @Test
    public void removeDogTest(){
        String name = "Evan";
        Date birthdate = new Date();
        Integer id = 3;

        Dog evan = new Dog(name, birthdate, id);

        DogHouse.add(evan);
        DogHouse.remove(3);

        Assert.assertEquals(null, DogHouse.getDogById(2));
        DogHouse.clear();
    }

    @Test
    public void getDogById(){
        String name = "Greg";
        Date birthdate = new Date();
        Integer id = 4;

        Dog greg = new Dog(name, birthdate, id);

        DogHouse.add(greg);

        Assert.assertEquals(greg, DogHouse.getDogById(4));
        DogHouse.clear();
    }
}
