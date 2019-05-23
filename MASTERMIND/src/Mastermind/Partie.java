package Mastermind;


import static Mastermind.Affichage.consoleAfficher;
import static Mastermind.Parametres.entreeInput;
import static Mastermind.Parametres.inputRight;


/** Classe contenant les informations d'une partie de Mastermind
 *
 */
public class Partie
{
    private int NOMBRE_LIGNES;
    private int NOMBRE_INPUTS;

    private char[][] inputs;
    private char[] code;

    private static  final char MIN_DIFFICULTE = '1';
    private static final char MAX_DIFFICULTE = '3';
    private char difficulte;

    private char minInputValue;
    private char maxInputValue;

    private boolean victoire;
    private int tourFinal;

    /**
     * Réalisation du jeu
     */
    public Partie()
    {
        // On initialise les paramètres
        difficulte = entreeInput("     Veuillez choisir la difficulté : ", MIN_DIFFICULTE, MAX_DIFFICULTE);

        lancerPartie();
    }



    /**
     * Réalisation du jeu
     * @param difficulte difficulté de la partie
     */
    public Partie(char difficulte)
    {
        // On initialise les paramètres
        this.difficulte = difficulte;

        lancerPartie();
    }


    /** Prépare les paramètres selon la difficulté sélectionnée
     *
     */
    private void setParametres()
    {
        switch(difficulte)
        {
            case '1':
                NOMBRE_INPUTS = 3;
                NOMBRE_LIGNES = 5;
                minInputValue = '0';
                maxInputValue = '1';
                break;

            case '2':
                NOMBRE_INPUTS = 4;
                NOMBRE_LIGNES = 10;
                minInputValue = 'a';
                maxInputValue = 'z';
                break;

            case '3':
                NOMBRE_INPUTS = 6;
                NOMBRE_LIGNES = 8;
                minInputValue = 'a';
                maxInputValue = 'z';
                break;

            default:
                NOMBRE_INPUTS = 5;
                NOMBRE_LIGNES = 10;
                minInputValue = 'a';
                maxInputValue = 'z';
                break;
        }


        System.out.println("Vous avez choisi la difficulté : " + difficulte );
        System.out.println("Veuillez entrer des valeurs comprises entre (inclusif) " + minInputValue + " et " + maxInputValue);

        // On initialise le code secret et les inputs utilisateurs
        code = new char[NOMBRE_INPUTS];
        inputs = new char[NOMBRE_LIGNES][NOMBRE_INPUTS];

        for(int i = 0; i< NOMBRE_LIGNES; i++)
        {
            for(int j = 0; j< NOMBRE_INPUTS; j++)
                inputs[i][j] = '.';
        }
    }


    /** S'occupe de gérer le déroulement d'une partie (vérification, arrêt, affichage des résultats)
     *
     */
    private void lancerPartie()
    {
        // On prépare les paramètres en conséquences (tailles tableau, min / max)
        setParametres();


        // On demande à rentrer le code secret
        entreeCodeSecret();


        victoire = false;
        tourFinal = 0;

        // On crée une boucle pour entrer les inputs afin de trouver la solution
        for(int index = 0; index < NOMBRE_LIGNES; index++)
        {
            tourFinal++;
            entreeTentative(index);
            consoleAfficher(code, inputs);

            victoire = inputRight(code, inputs[index]) == NOMBRE_INPUTS;
            if (victoire)
                break;
        }

        afficherResultat();
    }



    /** Demande à l'utilisateur de rentrer le code secret
     */
    private void entreeCodeSecret()
    {
        System.out.println("CODE SECRET \n\n");

        for(int index = 0; index < NOMBRE_INPUTS; index++)
        {
            boolean condition;

            do
            {
                condition = true;
                code[index] = entreeInput("      Char n° " + index + " : ", minInputValue, maxInputValue);

                if(difficulte != 1)
                {
                    for ( int i = 0; i < index; i++)
                    {
                        if (code[i]  == code[index])
                        {
                            condition = false;
                            break;
                        }
                    }
                }
            }
            while(!condition);
        }
    }


    /** Lance la récupération (et vérification) des inputs lors d'un tour de jeu
     * @param ligne Ligne à laquelle on ajoute les inputs
     */
    private void entreeTentative(int ligne)
    {
        System.out.println("LIGNE N° " + ligne + "\n\n");

        for(int index = 0; index < NOMBRE_INPUTS; index++)
        {
            boolean condition;

            do
            {
                condition = true;
                inputs[ligne][index] = entreeInput("      Entrez  l'input n° " + index + " (fdp) : ", minInputValue, maxInputValue);

                if(difficulte != 1)
                {
                    for ( int i = 0; i < index; i++)
                    {
                        if (inputs[ligne][i] == inputs[ligne][index])
                        {
                            condition = false;
                            break;
                         }
                    }
                }
            }
            while(!condition);
        }
    }


    /** Affiche les résultats en conséquences de victoire ou défaite
     *
     */
    private void afficherResultat()
    {
        System.out.println("\n\n\n\n        Dernier tour joué : n° " + tourFinal + "\n\n\n");
        if(victoire)
                System.out.println("    you win - GG !! \n\n\n\n\n\n");
        else
            System.out.println("you lose : Git Gud. \n\n\n\n\n\n");
    }
}