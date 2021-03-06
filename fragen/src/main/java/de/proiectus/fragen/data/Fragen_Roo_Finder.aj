// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.proiectus.fragen.data;

import de.proiectus.fragen.data.Fragen;
import de.proiectus.fragen.data.FragenKategorie;
import de.proiectus.fragen.data.Kategorie;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Fragen_Roo_Finder {
    
    public static Long Fragen.countFindFragensByKat(Kategorie kat) {
        if (kat == null) throw new IllegalArgumentException("The kat argument is required");
        EntityManager em = Fragen.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Fragen AS o WHERE o.kat = :kat", Long.class);
        q.setParameter("kat", kat);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Fragen.countFindFragensByKattype(FragenKategorie kattype) {
        if (kattype == null) throw new IllegalArgumentException("The kattype argument is required");
        EntityManager em = Fragen.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Fragen AS o WHERE o.kattype = :kattype", Long.class);
        q.setParameter("kattype", kattype);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<Fragen> Fragen.findFragensByKat(Kategorie kat) {
        if (kat == null) throw new IllegalArgumentException("The kat argument is required");
        EntityManager em = Fragen.entityManager();
        TypedQuery<Fragen> q = em.createQuery("SELECT o FROM Fragen AS o WHERE o.kat = :kat", Fragen.class);
        q.setParameter("kat", kat);
        return q;
    }
    
    public static TypedQuery<Fragen> Fragen.findFragensByKat(Kategorie kat, String sortFieldName, String sortOrder) {
        if (kat == null) throw new IllegalArgumentException("The kat argument is required");
        EntityManager em = Fragen.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Fragen AS o WHERE o.kat = :kat");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Fragen> q = em.createQuery(queryBuilder.toString(), Fragen.class);
        q.setParameter("kat", kat);
        return q;
    }
    
    public static TypedQuery<Fragen> Fragen.findFragensByKattype(FragenKategorie kattype) {
        if (kattype == null) throw new IllegalArgumentException("The kattype argument is required");
        EntityManager em = Fragen.entityManager();
        TypedQuery<Fragen> q = em.createQuery("SELECT o FROM Fragen AS o WHERE o.kattype = :kattype", Fragen.class);
        q.setParameter("kattype", kattype);
        return q;
    }
    
    public static TypedQuery<Fragen> Fragen.findFragensByKattype(FragenKategorie kattype, String sortFieldName, String sortOrder) {
        if (kattype == null) throw new IllegalArgumentException("The kattype argument is required");
        EntityManager em = Fragen.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Fragen AS o WHERE o.kattype = :kattype");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Fragen> q = em.createQuery(queryBuilder.toString(), Fragen.class);
        q.setParameter("kattype", kattype);
        return q;
    }
    
}
