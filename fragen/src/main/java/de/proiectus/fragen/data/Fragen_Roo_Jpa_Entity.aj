// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package de.proiectus.fragen.data;

import de.proiectus.fragen.data.Fragen;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Fragen_Roo_Jpa_Entity {
    
    declare @type: Fragen: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Fragen.id;
    
    @Version
    @Column(name = "version")
    private Integer Fragen.version;
    
    public Long Fragen.getId() {
        return this.id;
    }
    
    public void Fragen.setId(Long id) {
        this.id = id;
    }
    
    public Integer Fragen.getVersion() {
        return this.version;
    }
    
    public void Fragen.setVersion(Integer version) {
        this.version = version;
    }
    
}