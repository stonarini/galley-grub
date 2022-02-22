package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total;
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
        if (this.firstExtra != null) {
            sumExtrasCharge();
        }
        return this.total;

    }

    @Override
    public void sumExtrasCharge() {
        firstExtra.sumExtras(comanda);
        this.total = comanda.getTotal();
    }

    @Override
    public void print() {
        this.comanda.display();
        System.out.println(String.format("\tTOTAL --------> %.2f$", this.total != null ? this.total : 0.00));
    }

}
