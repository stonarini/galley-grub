package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    public CheeseExtra() {
    };

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> cheeseTotal = comanda.itemList().stream()
                .filter(i -> i.extra() != null)
                .filter(i -> i.extra().equalsIgnoreCase(Extras.CHEESE.name()))
                .map(i -> Extras.CHEESE.getPrice())
                .reduce(Double::sum);

        cheeseTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
