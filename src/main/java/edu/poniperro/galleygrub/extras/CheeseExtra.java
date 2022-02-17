package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    public CheeseExtra() {
    };

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> cheeseTotal = comanda.itemList().stream()
                .filter(i -> i.extra() == CHEESE)
                .map(i -> Prices.getPriceOf(CHEESE))
                .reduce(Double::sum);

        cheeseTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
