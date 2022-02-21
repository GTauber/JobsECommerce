package br.com.taubercommerce.DAO;

import br.com.taubercommerce.model.JobsModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JobsDAO {
    @PersistenceContext
    private EntityManager em;

    public void save(JobsModel job) {
        em.persist(job);
    }
}
