package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra {
    public SauceExtra() {
    };

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> sauceTotal = comanda.itemList().stream()
                .filter(i -> i.extra().equalsIgnoreCase(Extras.SAUCE.name()))
                .map(i -> Extras.SAUCE.getPrice())
                .reduce(Double::sum);

        sauceTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
