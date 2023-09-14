import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        lucky7();
    }
        // 1. Function to check if the number is 7 or not.
    public static boolean lucky7() {
        	Random rand = new Random();
		
		int[] arr = new int[3];
		int max = 10;
		int min = 1;
		boolean flag =false;
		
		for(int i = 0; i<2; i++) {
			arr[i]= rand.nextInt((max - min) + 1) + min;
		}
		
		for(int item : arr) {
			System.out.print(item+" ");
            if(!flag && item ==7)
                flag =true;
		}
        System.out.println();
        if(flag)
            System.out.println("You won");
        else
            System.out.println("You lost");
            return flag;
    }
}
