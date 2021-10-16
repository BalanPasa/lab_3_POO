import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        /*
        1.Creați un program în care ar trebui să aveți un text uriaș (codat într-o variabilă) și acesta va solicita în consolă 
        numărul de propoziții și cuvinte ale acestui text.Ar trebui să aveți, cel puțin, o clasă pentru funcția principală 
        și o altă clasă pentru informațiile de manipulare a textului.
        2.Afișați în consolă numărul de litere, vocale și consoane din textul respectiv.
        3.Implementați, de asemenea, pentru a afișa cele mai des cuvinte din text (top 5) și cel mai lung.
        */

        System.out.println("Nivel de baza:");
        System.out.println("Introduce textul:");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Text textInput = new Text(text);

        System.out.println("Numărul de propoziții: " + textInput.countSentences());
        System.out.println("Numărul de CUVINTE:" + textInput.countWords());

        System.out.println("\nNivel avansat(1):");
        System.out.println("Litere: " + textInput.countLetters());
        System.out.println("Vocale: " + textInput.countVowels());
        System.out.println("Consoane: " + textInput.countConsonants());

        System.out.println("\nNivel avansat(2):");
        System.out.println("Cel mai frecvent cuvânt este: " + textInput.getFrequent());
        System.out.println("Cel mai lung cuvânt este: " + textInput.getLongest());
    }
}