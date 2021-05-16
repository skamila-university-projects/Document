package skamila.udpj.document.repository;

import org.springframework.stereotype.Repository;
import skamila.udpj.document.model.Tag;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
public class TagCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String getTag(long id) {
        TypedQuery<Tag> query = entityManager
                .createQuery("SELECT t FROM Tag AS t WHERE t.id = :id", Tag.class)
                .setParameter("id", id);
        return query.getSingleResult().getTag();
    }

    @Transactional
    public void updateTag(String oldTagName, String newTagName) {
        Query query = entityManager
                .createQuery("UPDATE Tag AS t SET t.tag = :newTagName WHERE t.tag = :oldTagName")
                .setParameter("oldTagName", oldTagName)
                .setParameter("newTagName", newTagName);
        query.executeUpdate();
    }
}
