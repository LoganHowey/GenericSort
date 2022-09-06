package util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericSortTest {

    @Test
    public void getAndSetIntArrayCheck() {
        GenericSort newGenericSort = new GenericSort();
        Integer[] newIntArray = new Integer[]{10, 20, 30};
        Integer[] differentIntArray = new Integer[]{100,200,400};
        newGenericSort.setIntArray(newIntArray);
        Assert.assertThat(newGenericSort.getIntArray(), Is.is(newIntArray));
    }

    @Test
    public void getAndSetDoubleArrayCheck(){
        GenericSort newGenericSort = new GenericSort();
        Double[] newDoubleArray = new Double[]{10.0,20.0,30.0};
        newGenericSort.setDoubleArray(newDoubleArray);
        Assert.assertThat(newGenericSort.getDoubleArray(), Is.is(newDoubleArray));
    }

     @Test
    public void getAndSetCharacterArrayCheck(){
        GenericSort newGenericSort = new GenericSort();
        Character[] newCharacterArray = new Character[]{'a', 'b', 'c' };
        newGenericSort.setCharacterArray(newCharacterArray);
        Assert.assertThat(newGenericSort.getCharacterArray(), Is.is(newCharacterArray));
    }

    @Test
    public void getAndSetStringArrayCheck(){
        GenericSort newGenericSort = new GenericSort();
        String[] newStringArray = new String[]{"All", "Cows", "Eat", "Grass"};
        newGenericSort.setStringArray(newStringArray);
        Assert.assertThat(newGenericSort.getStringArray(), Is.is(newStringArray));
    }

    @Test
    public void canSortCharArray(){
        GenericSort newGenericSort = new GenericSort();
        Character[] newCharArray = new Character[]{'c', 'a', 'b'};
        Character[] expectedChar = new Character[]{'a', 'b', 'c'};
        newGenericSort.setCharacterArray(newCharArray);
        Assert.assertThat(newGenericSort.sort(newCharArray), Is.is(expectedChar));
    }

    @Test
    public void canSortStringArray(){
        GenericSort newGenericSort = new GenericSort();
        String[] newStringArray = new String[]{"Coconut", "Alligator", "Balloons"};
        String[] expectedString = new String[]{"Alligator", "Balloons", "Coconut"};
        newGenericSort.setStringArray(newStringArray);
        Assert.assertThat(newGenericSort.sort(newStringArray), Is.is(expectedString));
    }

    @Test
    public void canSortIntArray(){
        GenericSort newGenericSort = new GenericSort();
        Integer[] newIntArray = new Integer[]{3,1,2};
        Integer[] expectedInt = new Integer[]{1,2,3};
        newGenericSort.setIntArray(newIntArray);
        Assert.assertThat(newGenericSort.sort(newIntArray), Is.is(expectedInt));
    }

    @Test
    public void canSortDoubleArray() {
        GenericSort newGenericSort = new GenericSort();
        Double[] newDoubleArray = new Double[]{3.0, 1.0, 2.0};
        Double[] expectedDouble = new Double[]{1.0, 2.0, 3.0};
        Assert.assertThat(newGenericSort.sort(newDoubleArray), Is.is(expectedDouble));
    }


}