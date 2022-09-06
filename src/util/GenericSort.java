package util;

import java.lang.reflect.Type;
import java.util.Arrays;

public class GenericSort {

    private Integer[] intArray;
    private Double[] doubleArray;
    private Character[] characterArray;
    private String[] stringArray;


    public GenericSort() {
        Integer[] intArray;
        Double[] doubleArray;
        Character[] characterArray;
        String[] stringArray;
    }

    public Integer[] getIntArray() {
        return intArray;
    }

    public void setIntArray(Integer[] intArray) {
        this.intArray = intArray;
    }

    public Double[] getDoubleArray() {
        return doubleArray;
    }

    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public Character[] getCharacterArray() {
        return characterArray;
    }

    public void setCharacterArray(Character[] characterArray) {
        this.characterArray = characterArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void  printList(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);}
            }


    public Comparable[] sort(Comparable[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++) {
                int comparing = list[j].compareTo(list[index]);
                if (comparing < 0) {
                    index = j;//searching for lowest index
                }
            }
            Comparable smallerNumber = list[index];
            list[index] = list[i];
            list[i] = smallerNumber;
        }
        printList(list);
        return list;
    }

}
