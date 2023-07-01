/* Problem Statement ----->>>
Given an Array list of integer n , your task is to reverse that list.
TC -- O(n)            SC -- O(1)
*/




import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
           // Write your code here.
           int n =arr.size();
           int a1 = m+1;
           int a2 = n-1;
           while(a1<a2) {
               Collections.swap(arr,a1,a2);
               a1++;
               a2--;
           }
    }
}
