package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {
    public SizeLargeExtra() {
    };

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> sizeLargeTotal = comanda.itemList().stream()
                .filter(i -> i.extra() == SIZE_LARGE)
                .map(i -> Prices.getPriceOf(SIZE_LARGE))
                .reduce(Double::sum);

        sizeLargeTotal.ifPresent(comanda::updateTotal);
        nextExtra.ifPresent(e -> e.sumExtras(comanda));
    }
}
