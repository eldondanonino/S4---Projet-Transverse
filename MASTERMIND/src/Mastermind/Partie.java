package Mastermind;


import java.util.Random;
import java.util.Scanner;

import static Mastermind.Affichage.consoleAfficher;

/** Classe contenant les informations d'une partie de Mastermind
 *
 */
public class Partie
{
    private int NOMBRE_LIGNES;
    private int NOMBRE_INPUTS;
    char[][] inputs;
    char[] code;




    public Partie(int NOMBRE_LIGNES, int NOMBRE_INPUTS)
    {
        this.NOMBRE_LIGNES = NOMBRE_LIGNES;
        this.NOMBRE_INPUTS = NOMBRE_INPUTS;

        initializeInputs();

        // On demande à rentrer le code secret



        // On crée une boucle pour entrer les inputs afin de trouver la solution
        for(int index = 0; index < NOMBRE_LIGNES; index++)
        {
            entreeInputs(index);
            consoleAfficher(NOMBRE_LIGNES, NOMBRE_INPUTS, inputs);
        }
    }


    /** Initialise le double tableau d'inputs
     *
     */
    private void initializeInputs()
    {
        inputs = new char[NOMBRE_LIGNES][NOMBRE_INPUTS];

        for(int i = 0; i< NOMBRE_LIGNES; i++)
        {
            for(int j = 0; j< NOMBRE_INPUTS; j++)
                inputs[i][j] = '.';
        }
    }


    /** Lance la récupération (et vérification) des inputs
     * @param ligne Ligne à laquelle on ajoute les inputs
     */
    private void entreeInputs (int ligne)
    {
        System.out.println("LIGNE N° " + ligne + "\n\n");

        for(int index = 0; index < NOMBRE_INPUTS; index++)
            inputs[ligne][index] = entreeInput(index);
    }


    /** Vérifie l'input de l'utilisateur et contraint l'input à un caractère compris entre 'a' et 'z'
     *
     * @param index Rang de l'input
     * @return l'input vérifié et validé
     */
    private char entreeInput (int index)
    {
        Scanner sc = new Scanner(System.in);
        char input;
        do
        {
            System.out.print("      Entrez  l'input n° " + index + " (fdp) : ");
            input = getInput();
        }
        while('a' > input || input > 'z');

        System.out.println();
        return input;
    }


    /** Scanne l'input utilisateur
     *
     * @return la première lettre de l'input utilisateur
     */
    private char getInput()
    {
        Scanner sc = new Scanner(System.in);
        char input;

        try
        {
            input = sc.next().charAt(0);
        }
        catch (NumberFormatException e)
        {
            input = ' ';
            System.out.println("    Veuillez entrer un input CORRECT (bas tard)");
        }

        return input;
    }
}