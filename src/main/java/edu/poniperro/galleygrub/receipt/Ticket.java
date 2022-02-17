package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    public Comanda getOrder();

    public void setChain(Extra firsExtra);

    public Extra getChain();

    public void sumExtrasCharge();

    public Double total();

    public void print();
}
