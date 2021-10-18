package loops;

import java.util.Scanner;

public class Array {

public static void main(String[] args) {
// TODO Auto-generated method stub

String animals[]=new String[5];
animals[0]="Panda";
animals[1]="Horse";
animals[2]="Swan";
animals[3]="Hippo";
animals[4]="Deer";
//animals[5]="Lion";
// System.out.print(animals[4]);
for(int i=0;i<animals.length;i++) {
System.out.println(animals[i]);



}
Scanner sc=new Scanner(System.in);
int matrix[][]=new int[3][3];
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
matrix[i][j]=sc.nextInt();
}
}
for(int i=0;i<3;i++) {
for(int j=0;j<3;j++) {
System.out.print(matrix[i][j]);
}
System.out.println();
}
}



}
