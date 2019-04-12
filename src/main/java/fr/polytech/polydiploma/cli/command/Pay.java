package fr.polytech.polydiploma.cli.command;

import fr.polytech.polydiploma.api.PolydiplomaComptaPublicAPI;
import fr.polytech.polydiploma.cli.framework.Command;
import fr.polytech.polydiploma.stubs.Paiement;

import java.util.List;

public class Pay extends Command<PolydiplomaComptaPublicAPI> {

    private String extraData;
    private int amount;

    @Override
    public String identifier() {
        return "pay";
    }

    @Override
    public void execute() {
        Paiement paiement = new Paiement();
        paiement.setAmount(amount);
        paiement.setExtraData(extraData);
        shell.system.compta.pay(paiement);
    }

    @Override
    public void load(List<String> args) {
        amount = Integer.parseInt(args.get(0));
        extraData = args.get(1);
    }

    @Override
    public String describe() {
        return "Payer le montant indiquer";
    }

    @Override
    public boolean shouldContinue() {
        return true;
    }

}
