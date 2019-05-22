package Mastermind;

import java.util.Random;


/** Classe contenant les fonctions relatives à l'affichage du Mastermind
 *
 */
public class Affichage
{
    /** Affichage console du plateau de Mastermind
     * @param NOMBRE_LIGNES nombre de tours dans la partie
     * @param NOMBRE_INPUTS nombre d'inputs dans un tour
     * @param inputs Double Tableau contenant tous les inputs
     */
    public static void consoleAfficher(int NOMBRE_LIGNES, int NOMBRE_INPUTS, char[][] inputs)
    {
        System.out.println( "\n\n");

        Random r = new Random();

        for( int index = 0; index <NOMBRE_LIGNES; index++ )
        {
            consoleAfficherLigne(3, 3, inputs[index]);
        }

        System.out.println( "\n\n");
    }


    /** Affichage console d'une ligne du plateau de Mastermind
     * @param right nombre d'inputs corrects et bien placés
     * @param almost nombre d'inputs corrects mais mal placés
     * @param inputs les différents inputs
     *
     */
    private static void consoleAfficherLigne(int right, int almost, char[] inputs )
    {
        System.out.print("\nRight inputs : " + right + "   -   Almost inputs : " + almost + "     |     ");

        for (char input : inputs)
            System.out.print("   " + input);
    }
}
