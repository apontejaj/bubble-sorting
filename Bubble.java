
public class Bubble extends Thread{
	
	int[] a;
	
	public Bubble(int[] ref){
		a = ref;
		
	}
	
	public void sleep(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		
		sleep();
		int j;
		boolean flag = true;   // set flag to true to begin first pass
		int temp;   //holding variable

		while ( flag ) {
		
	       	flag = false;    //set flag to false awaiting a possible swap
	       	
	       	for(j=0;  j < a.length -1;  j++ ){
	       		
              	if ( a[ j ] < a[j+1] ){   // change to > for ascending sort
              		
              		temp = a[ j ];                //swap elements
	                a[ j ] = a[ j+1 ];
	                a[ j+1 ] = temp;
	                flag = true;              //shows a swap occurred  
	                sleep();
              	} 
	       	} 
		} 
		
		
	}
	
	
}
