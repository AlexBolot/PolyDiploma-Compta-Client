package fr.polytech.polydiploma;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClientComptaBean {
    @EJB
    Payment paiment;
}
