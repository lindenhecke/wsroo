// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.proiectus.data;

import de.proiectus.data.Vokabel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Vokabel_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Vokabel.entityManager;
    
    public static final List<String> Vokabel.fieldNames4OrderClauseFilter = java.util.Arrays.asList("seite1", "seite2", "katSet", "katRef");
    
    public static final EntityManager Vokabel.entityManager() {
        EntityManager em = new Vokabel().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Vokabel.countVokabels() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Vokabel o", Long.class).getSingleResult();
    }
    
    public static List<Vokabel> Vokabel.findAllVokabels() {
        return entityManager().createQuery("SELECT o FROM Vokabel o", Vokabel.class).getResultList();
    }
    
    public static List<Vokabel> Vokabel.findAllVokabels(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Vokabel o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Vokabel.class).getResultList();
    }
    
    public static Vokabel Vokabel.findVokabel(Long id) {
        if (id == null) return null;
        return entityManager().find(Vokabel.class, id);
    }
    
    public static List<Vokabel> Vokabel.findVokabelEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Vokabel o", Vokabel.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Vokabel> Vokabel.findVokabelEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Vokabel o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Vokabel.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Vokabel.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Vokabel.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Vokabel attached = Vokabel.findVokabel(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Vokabel.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Vokabel.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Vokabel Vokabel.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Vokabel merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}