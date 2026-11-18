import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static String nom;
    static int pvMax = 100;
    static int pv = 100;
    static int attaque = 15;

    public static void afficherIntroduction() {
        System.out.println();
        System.out.println("BIP. BIP. BIIIIP.");
        System.out.println("Tu ouvres un oeil. Puis le deuxième...");
        System.out.println();
        System.out.println("Bienvenue à bord de la station, " + nom + ".");
        System.out.println("Petit souci : tout le monde est mort.");
        System.out.println("Et l'ordinateur de bord, ARGOS, a décidé qu'il était désormais le capitaine.");
        System.out.println();
        System.out.println("ARGOS : \"Bonjour " + nom + ". Merci de rester calme pendant votre élimination.\"");
        System.out.println();
        System.out.println("Ta mission : atteindre la capsule de secours avant de finir en morceaux.");
    }

    public static void afficherMenu() {
        System.out.println();
        System.out.println("Qu'est-ce que tu fous ?");
        System.out.println("1 - Vérifier que tu es encore en un seul morceau");
        System.out.println("2 - Avancer courageusement (ou presque)");
        System.out.println("0 - Retourner te cacher comme une merde");
    }

    public static void afficherEtat() {
        System.out.println();
        System.out.println("Diagnostic de " + nom);
        System.out.println("PV : " + pv + "/" + pvMax);
        System.out.println("Attaque : " + attaque);
        System.out.println("Moral : étonnamment bon pour un joueur de WOW");
    }

    public static void main(String[] args) {
        System.out.println("-- STATION ORBITALE --");
        System.out.print("Ton nom, et vite ? ");
        nom = scanner.nextLine();

        afficherIntroduction();

        String choix;
        do {
            afficherMenu();
            System.out.print("Ton choix : ");
            choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    afficherEtat();
                    break;
                case "2":
                    System.out.println("Tu fais un pas vers la porte... mais elle ne s'ouvre pas mdr.");
                    break;
                case "0":
                    System.out.println("ARGOS te souhaite une bonne nuit, pour toujours.");
                    break;
                default:
                    System.out.println("ARGOS : \"Commande non reconnue. Même moi je ne comprends pas.\"");
            }
        } while (!choix.equals("0"));

        scanner.close();
    }
}
