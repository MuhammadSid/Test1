class Prime
{
	public static void main(String args[]){
	int arr [] = {3,6,7,9,11,45};
	
	for(int i=0; i<arr.length; i++);{
	boolean check =true;
	
	for(int j=2; j<i; j++){
	if(i%j==0){
	check= false;
	break;
	}}
	if(check)
	System.out.print(i);

}}}
	