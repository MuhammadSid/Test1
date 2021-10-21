class Bizz
{
	public static void main(String args[]){
	int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	
	for(int i=1; i<=30; i++)
		if(i%3==0 && i%5 ==0)
		{
		System.out.println(i+" BizzFuzz");
		}
			
			else if( i% 5 ==0){
			System.out.println(i+" Fuzz");
			}
							
							else if( i%3 ==0)
							{
											System.out.println(i+" Bizz");
}}}


				