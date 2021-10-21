class Min{
public static void main(String [] args){

int [] a = {4,3,5,6,7,10,11};

int min =a[0];

for (int i= 1; i<a.length;i++){

if(min> a[i]) {
 
min = a[i]; }}

System.out.println("manimum element is " + min);

}}