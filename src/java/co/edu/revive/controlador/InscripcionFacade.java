/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.revive.controlador;

import co.edu.revive.entidades.Inscripcion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mauro Parra
 */
@Stateless
public class InscripcionFacade extends AbstractFacade<Inscripcion> {

    @PersistenceContext(unitName = "revivePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InscripcionFacade() {
        super(Inscripcion.class);
    }
    
}
