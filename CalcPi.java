// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double Deno = 1;
		double sum = 0;
		int S = 1;

		for(int i=0 ; i<N ; i++ ){
			
			sum = sum + (S*(1/Deno));
			Deno = Deno+2;
			S = (S*-1);
		}

		System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + sum*4);
	}
}
