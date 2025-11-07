public class TimeCalc {
    public static void main(String[] args) {

        int hh = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int mm = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]);

        int Allmm = hh*60+mm+minAdd;
        int Allhh = Allmm/60;
        int Newhh = Allhh%24;
        int Newmm = Allmm - (60*Allhh);

        if (Newhh>=10){
            System.out.print(Newhh+":");
        }
        else{
            System.out.print("0"+Newhh+":");
        }
        if (Newmm>=10) {
            System.out.print(Newmm);
        }
        else{
            System.out.print("0"+Newmm);
        }
    } 
}
