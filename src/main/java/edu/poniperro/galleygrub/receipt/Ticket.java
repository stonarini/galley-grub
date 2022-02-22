package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    public Comanda getOrder();

    public void setChain(Extra firstExtra);

    public Extra getChain();

    public void sumExtrasCharge();

    public Double total();

    public void print();
}
