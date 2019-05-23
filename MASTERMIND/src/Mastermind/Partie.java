package Mastermind;


import static Mastermind.Affichage.consoleAfficher;
import static Mastermind.Parametres.entreeInput;


/** Classe contenant les informations d'une partie de Mastermind
 *
 */
public class Partie
{
    private int NOMBRE_LIGNES;
    private int NOMBRE_INPUTS;
    char[][] inputs;
    char[] code;


    /**
     * Réalisation du jeu
     * @param NOMBRE_LIGNES nombre de lignes du tableau
     * @param NOMBRE_INPUTS nombre de colonnes du tableau
     */

    public Partie(int NOMBRE_LIGNES, int NOMBRE_INPUTS)
    {
        // On initialise les paramètres
        this.NOMBRE_LIGNES = NOMBRE_LIGNES;
        this.NOMBRE_INPUTS = NOMBRE_INPUTS;


        // On initialise le code secret et les inputs utilisateurs
        code = new char[NOMBRE_INPUTS];
        inputs = new char[NOMBRE_LIGNES][NOMBRE_INPUTS];

        for(int i = 0; i< NOMBRE_LIGNES; i++)
        {
            for(int j = 0; j< NOMBRE_INPUTS; j++)
                inputs[i][j] = '.';
        }


        // On demande à rentrer le code secret
        entreeCodeSecret();


        // On crée une boucle pour entrer les inputs afin de trouver la solution
        for(int index = 0; index < NOMBRE_LIGNES; index++)
        {
            entreeTentative(index);
            consoleAfficher(code, inputs);
        }
    }



    /** Demande à l'utilisateur de rentrer le code secret
     */
    private void entreeCodeSecret()
    {
        for( int i = 0; i <NOMBRE_INPUTS ; i++)
            code[i] = entreeInput("      Entrez  le code secret :  char n° " + i + " : ");
    }


    /** Lance la récupération (et vérification) des inputs lors d'un tour de jeu
     * @param ligne Ligne à laquelle on ajoute les inputs
     */
    private void entreeTentative(int ligne)
    {
        System.out.println("LIGNE N° " + ligne + "\n\n");

        for(int index = 0; index < NOMBRE_INPUTS; index++)
            inputs[ligne][index] = entreeInput("      Entrez  l'input n° " + index + " (fdp) : ");
    }
}