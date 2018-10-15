
public class EvenOdd {

    public String play(String myChoice,int myNumber){
        int computerNumber;
        double random = Math.random();
        if (random<0.16){
            computerNumber=0;
        }
        else if (random<0.33){
            computerNumber=1;
        }
        else if (random<0.5){
            computerNumber=2;
        }
        else if (random<0.66){
            computerNumber=3;
        }
        else if (random<0.83){
            computerNumber=4;
        }
        else {
            computerNumber=5;
        }
        int sum = myNumber+computerNumber;
        if ((sum%2 == 0 && myChoice == "pari")
                || (sum%2 !=0 && myChoice =="dispari")){
            return "Scegliere pari o dispari ? \nIo : "+myChoice +
                    "\nButtate un numero :\nIo : "+myNumber +
                    "\nComputer : "+computerNumber+"\nLa somma dei due numeri è : "+sum+"\nComplimenti,hai vinto !\n";
        }
        else {
            return"Scegliere pari o dispari ? \nIo : "+myChoice +
                    "\nButtate un numero :\nIo : "+myNumber +
                    "\nComputer : "+computerNumber+"\nLa somma dei due numeri è : "+sum+"\nMi dispiace,hai perso !\n";
        }
    }

    public String playWithDivision(String myChoice, int myNumber) {
        int computerNumber;
        Double random = Math.random();
        if (random < 0.2) {
            computerNumber = 1;
        } else if (random < 0.4) {
            computerNumber = 2;
        } else if (random < 0.6) {
            computerNumber = 3;
        } else if (random < 0.8) {
            computerNumber = 4;
        } else {
            computerNumber = 5;
        }
        int sum = (int) myNumber / computerNumber;
        if ((sum%2 == 0 && myChoice == "pari")
                || (sum%2 != 0 && myChoice == "dispari")) {
            return "Scegliere pari o dispari ? \nIo : "+myChoice +
                    "\nButtate un numero :\nIo : "+myNumber +
                    "\nComputer : "+computerNumber+"\nLa divisione (senza resto) dei due numeri è : "+sum+"\nComplimenti,hai vinto !\n";
        }
        else {
            return"Scegliere pari o dispari ? \nIo : "+myChoice +
                    "\nButtate un numero :\nIo : "+myNumber +
                    "\nComputer : "+computerNumber+"\nLa divisione (senza resto) dei due numeri è : "+sum+"\nMi dispiace,hai perso !\n";
        }
    }

}
