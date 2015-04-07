// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.proiectus.fragen.data;

import de.proiectus.fragen.data.Kategorie;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

privileged aspect Kategorie_Roo_Jpa_Entity {
    
    declare @type: Kategorie: @Entity;
    
    @Id
    @SequenceGenerator(name = "kategorieGen", sequenceName = "KAT_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "kategorieGen")
    @Column(name = "id")
    private Long Kategorie.id;
    
    @Version
    @Column(name = "version")
    private Integer Kategorie.version;
    
    public Long Kategorie.getId() {
        return this.id;
    }
    
    public void Kategorie.setId(Long id) {
        this.id = id;
    }
    
    public Integer Kategorie.getVersion() {
        return this.version;
    }
    
    public void Kategorie.setVersion(Integer version) {
        this.version = version;
    }
    
}