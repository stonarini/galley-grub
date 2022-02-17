package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extra {
    public Regular() {
    };

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> regularTotal = comanda.itemList().stream()
                .map(i -> i.price())
                .reduce(Double::sum);

        regularTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
