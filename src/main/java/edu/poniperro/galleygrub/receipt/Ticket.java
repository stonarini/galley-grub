package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    public Comanda getOrder();

    public Double total();

    public void print();
}
