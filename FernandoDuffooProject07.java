
/**
 * Fernando Duffoo
 * CSC1231
 * 7/3/2022
 * Project 07
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class FernandoDuffooProject07
{
    public static int randomNumberInsideRange (int min, int max)
    {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    public static void printArray (int arr[])
    {
        int i;
        for(i=0;i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int smallest (int arr[])
    {
        int smallest = arr[0];
        int i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static int largest (int arr[])
    {
        int largest = arr[0];
        int i;
        for(i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int range (int arr[])
    {
        return largest(arr) - smallest(arr);
    }
    public static double average(int arr[])
    {
        int i;
        int sum = 0;
        for (i = 0; i < arr.length; i++)
        sum += arr[i];
        return (sum / arr.length);
    }
    public static int linearSearch (int arr[], int key)
    {
        int i;
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i + 1;
            }
        }
        return(-1);
    }
    public static void selectSort(int arr[])
    {
       int n = arr.length;
       for (int i = 0; i < n-1; i++)
       {
           int min_idx= i;
           for(int j = i+1; j < n; j++)
           if(arr[j] < arr[min_idx])
           min_idx = j;
           
           int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i]=temp;
       }
    }
    public static void initializeArray(int arr[]) 
    {
        int i;
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = randomNumberInsideRange(1,100);
        }
    }
    public static void main(String args[])
    {
        int array[];
        array = new int[10];
        int i, key;
        Scanner in = new Scanner(System.in);
        
        initializeArray(array);
        printArray(array);
        
        System.out.println("Largest: " + largest(array) + " Smallest: " + smallest(array));
        System.out.println("Range: " + range(array));
        System.out.println("Average: " + average(array));
        
        System.out.println("Enter a key ");
        key = in.nextInt();
        System.out.println(key);
        System.out.println(linearSearch(array, key));
        int x = 11;
        int result = linearSearch(array,key);
        if(result == -1)
        System.out.print("Element is not present in the array");
        else
        System.out.print("Element is present in the index: " + result);
        System.out.println();
        
        selectSort(array);
        printArray(array);
    }
}