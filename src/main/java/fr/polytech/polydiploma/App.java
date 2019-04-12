package fr.polytech.polydiploma;

import fr.polytech.polydiploma.api.PolydiplomaComptaPublicAPI;
import fr.polytech.polydiploma.cli.command.Pay;
import fr.polytech.polydiploma.cli.framework.Shell;

public class App extends Shell<PolydiplomaComptaPublicAPI> {

    public App(String host, String port) {

        this.system = new PolydiplomaComptaPublicAPI(host, port);
        this.invite = "Compta CLI";

        // Registering the command available for the user
        register(
                Pay.class
        );
    }

    public static void main(String[] args) {
        String host = (args.length == 0 ? "localhost" : args[0]);
        String port = (args.length < 2 ? "8082" : args[1]);
        System.out.println("\n\nLancement du client pour la compta de Polydiploma");
        System.out.println("  - Serveur distant: " + host);
        System.out.println("  - Numéro de port:  " + port);
        App app = new App(host, port);
        app.run();
        System.out.println("Sortie du client pour la compta de Polydiploma\n\n");
    }
}
