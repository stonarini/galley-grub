package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total;
    private Comanda comanda;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.comanda;
    }

    @Override
    public Double total() {
        return comanda.getTotal();
    }

    @Override
    public void print() {
        this.comanda.display();
        System.out.println(String.format("\tTOTAL --------> %.2f$", total() != null ? total() : 0.00));
    }

}
