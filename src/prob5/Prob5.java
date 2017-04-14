package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		while(true){		
			Random r = new Random();
			int k = r.nextInt(100) + 1;					
			System.out.println("k="+k);
			System.out.println("수를 결정하였습니다. 맞춰보세요"+"\n"+"1-100");

			String answer = scanner.next();
			
			if( answer.equals("y") ){
			    //종료하도록 작성한다.
				break;
			}
			else
			{				
					int number=Integer.parseInt(answer);
					if(number<k)
					{
						System.out.println("더 높게"+"\n"+number+"-100");
					}
					else if(number>k)
					{
						System.out.println("더 낮게"+"\n"+"1-"+number);
					}
					else if(number==k)
					{
						System.out.println("맞았습니다."+"\n"+"종료하시겠습니까?(y/n)");
						
						break;
					}	

			}
		}
	scanner.close();
	}
}