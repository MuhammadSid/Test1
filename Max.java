class Max{
public static void main(String [] args){

int [] a = {4,3,5,6,7,10,11};

int max =a[0];

for (int i= 1; i<a.length;i++){

if(max< a[i]) {

max = a[i]; }}

System.out.println("maximium element is " + max);

}}