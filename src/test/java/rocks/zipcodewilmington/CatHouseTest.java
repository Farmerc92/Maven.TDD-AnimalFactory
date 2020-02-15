package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        String expectedName = "Gary";
        Date expectedDate = new Date();
        Integer expectedId = 10;

        Cat gary = new Cat(expectedName, expectedDate, expectedId);

        CatHouse home = new CatHouse();
        home.add(gary);

        Assert.assertEquals(gary, home.getCatById(10));
    }

    @Test
    public void removeCatIdTest(){
        String expectedName = "Gary";
        Date expectedDate = new Date();
        Integer expectedId = 30;

        Cat gary1 = new Cat(expectedName, expectedDate, expectedId);

        CatHouse home1 = new CatHouse();
        home1.add(gary1);
        home1.remove(30);

        Assert.assertEquals(null, home1.getCatById(30));
    }

    @Test
    public void removeCatObjectTest(){
        String expectedName = "Steve";
        Date expectedDate = new Date();
        Integer expectedId = 5;

        Cat steve = new Cat(expectedName, expectedDate, expectedId);

        CatHouse home2 = new CatHouse();
        home2.add(steve);
        home2.remove(steve);

        Assert.assertEquals(null, home2.getCatById(5));
    }

    @Test
    public void numberOfCatsTest(){
        String expectedName = "Gary";
        Date expectedDate = new Date();
        Integer expectedId = 10;

        Cat gary3 = new Cat(expectedName, expectedDate, expectedId);

        String name = "Steve";
        Date date = new Date();
        Integer id = 20;

        Cat steve = new Cat(name, date, id);

        Integer expected = 2;
        CatHouse home3 = new CatHouse();
        home3.add(gary3);
        home3.add(steve);

        Assert.assertEquals(expected, home3.getNumberOfCats());
    }

    @Test
    public void clearTest(){
        String expectedName = "Gary";
        Date expectedDate = new Date();
        Integer expectedId = 10;

        Cat gary = new Cat(expectedName, expectedDate, expectedId);

        String name = "Steve";
        Date date = new Date();
        Integer id = 20;

        Cat steve1 = new Cat(name, date, id);

        Integer expected = 0;
        CatHouse home4 = new CatHouse();
        home4.add(gary);
        home4.add(steve1);
        home4.clear();

        Assert.assertEquals(expected, home4.getNumberOfCats());
    }
}
