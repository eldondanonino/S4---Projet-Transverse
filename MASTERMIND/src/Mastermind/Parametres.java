package Mastermind;


import java.util.Scanner;

/** Classe servant à faire tout un tas de vérifications
 *
 */
class Parametres
{
    /** Vérifie l'input de l'utilisateur et contraint l'input à un caractère compris entre 'a' et 'z'
     *
     * @param message message à afficher
     * @param min valeur minimale de l'input
     * @param max valeur maximale de l'input
     * @return l'input vérifié et validé
     */
    public static char entreeInput (String message, char min, char max)
    {
        Scanner sc = new Scanner(System.in);
        char input;
        do
        {
            System.out.print(message);
            input = getInput();
        }
        while(min > input || input > max);

        System.out.println();
        return input;
    }


    /** Scanne l'input utilisateur
     *
     * @return la première lettre de l'input utilisateur
     */
    public static char getInput()
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
            System.out.println("    Veuillez entrer un input CORRECT");
        }

        return input;
    }



    /** Retourne le nombre d'inputs corrects ET à la bonne place
     *
     * @param code le code secret
     * @param inputs les inputs utilisateurs
     * @return le nombre d'inputs corrects ET à la bonne place
     */
    public static int inputRight(char[] code , char[] inputs )
    {
        int cpt = 0;
        for( int i = 0; i < inputs.length; i++ )
        {
            if (code[i] == inputs[i])
                cpt++;
        }

        return cpt;
    }


    /** Retourne le nombre d'inputs corrects MAIS pas à la bonne place
     *
     * @param code le code secret
     * @param inputs les inputs utilisateurs
     * @return le nombre d'inputs corrects ET à la bonne place
     */
    public static int inputAlmost(char[] code , char[] inputs )
    {
        int cpt = 0;
        for ( int i = 0; i < inputs.length; i++ )
        {
            for (int j = 0; j < inputs.length; j++ )
            {
                if( i != j && inputs[i] == code[j])
                {
                    cpt++;
                    break;
                }
            }
        }
        return cpt;
    }
}
