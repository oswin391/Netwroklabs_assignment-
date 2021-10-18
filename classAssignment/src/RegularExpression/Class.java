package RegularExpression;

import java.util.regex.*;  
public class Class{  
public static void main(String args[]){  
//1st way  
//Pattern p = Pattern.compile(".xx.");//. represents single character  
//Matcher m = p.matcher("axxb");  
//boolean b = m.matches();  
  
System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
  
//System.out.println(b);  
}} 