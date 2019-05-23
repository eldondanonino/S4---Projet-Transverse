package Mastermind;


import static Mastermind.Parametres.inputAlmost;
import static Mastermind.Parametres.inputRight;


/** Classe contenant les fonctions relatives à l'affichage du Mastermind
 *
 */
public class Affichage
{
    /** Affichage console du plateau de Mastermind
     * @param code le code secret
     * @param inputs Double Tableau contenant tous les inputs
     */
    public static void consoleAfficher(char[] code, char[][] inputs)
    {
        System.out.println( "\n\n");

        for( int index = 0; index <inputs.length ; index++ )
            consoleAfficherLigne(code, inputs[index]);


        System.out.println( "\n\n");
    }


    /** Affichage console d'une ligne du plateau de Mastermind
     * @param code le code secret
     * @param inputs les différents inputs
     *
     */
    private static void consoleAfficherLigne(char[] code , char[] inputs )
    {
        System.out.print("\nRight inputs : " + inputRight(code, inputs) + "   -   Almost inputs : " + inputAlmost(code, inputs) + "     |     ");

        for (char input : inputs)
            System.out.print("   " + input);
    }
}

