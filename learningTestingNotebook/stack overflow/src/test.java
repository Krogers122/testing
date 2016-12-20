//import java.math.*;
import java.util.Random;


class test {
public static void main(String[] args){
    int a [] = new int[9];{
            for (int i = 0; i < a.length; i++)
                a[i] = a[(int)(Math.random()*70+15)];
            for (int elem : a){
                System.out.println(elem);
            };              
}}}
