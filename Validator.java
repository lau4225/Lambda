import java.util.ArrayList;
import java.util.Arrays;

public class Validator {
    public void assertion(String tag, String result, String expected){
        if(result.equals(expected)){
            System.out.println("Test " + tag + " succeeded.");
        }
        else{
            System.out.println("Test " + tag + " failed, with result(" + result + ") and expected(" + expected +")");
        }
    }

    public void validateAll() {
        Exercices exercices = new Exercices();
        assertion("Exercice1",
                exercices.exercice1(
                        Arrays.asList("je", "ne", "suis", "pas", "en", "colère")
                ).toString(),
                "[JE, NE, SUIS, PAS, EN, COLÈRE]");
        assertion("Exercice2",
                exercices.exercice2(
                        Arrays.asList("INUTILE", "correct", "INUTILE", "important", "INUTILE")
                ).toString(),
                "[correct, important]");
        assertion("Exercice3",
                exercices.exercice3(
                        Arrays.asList("Bonjour ", "tout ", "le ", "monde!")
                ),
                "Bonjour tout le monde!");
        assertion("Exercice4",
                exercices.exercice4(
                        Arrays.asList("Salut ", "aAa", "Paul, ", "AaA", "AAA", "comment ", "aaa", "vas-tu?")
                ),
                "SALUT PAUL, COMMENT VAS-TU?");
        assertion("Exercice5",
                exercices.exercice5(
                        Arrays.asList(1,2,3,4,5)
                ).toString(),
                "[2, 4, 6, 8, 10]");
        assertion("Exercice6",
                exercices.exercice6(
                        Arrays.asList(1,2,3,4,5)
                ).toString(),
                "120");
        assertion("Exercice7",
                exercices.exercice7(
                        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                ).toString(),
                "[8, 9, 10]");
        assertion("Exercice8",
                exercices.exercice8(
                        Arrays.asList(1,2,3,4,5)
                ).toString(),
                "[9, 1, 2, 3, 4]");
        assertion("Exercice9",
                exercices.exercice9().toString(),
                "[21, 42, 63, 84, 105, 126, 147, 168, 189, 210]");
        assertion("Exercice10",
                exercices.exercice10().toString(),
                "[1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400]");
    }
}
