package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Comanda comanda;
    private Extra firstExtra;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.comanda;
    }

    @Override
    public void setChain(Extra firstExtra) {
        this.firstExtra = firstExtra;
    }

    @Override
    public Extra getChain() {
        return this.firstExtra;
    }

    @Override
    public Double total() {
        return comanda.getTotal();
    }

    @Override
    public void sumExtrasCharge() {
        firstExtra.sumExtras(comanda);
    }

    @Override
    public void print() {
        this.comanda.display();
        System.out.println(String.format("\tTOTAL --------> %.2f$", total() != null ? total() : 0.00));
    }

}
