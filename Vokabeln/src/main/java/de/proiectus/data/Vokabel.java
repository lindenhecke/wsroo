package de.proiectus.data;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Vokabel {

    /**
     */
    private String seite1;

    /**
     */
    private String seite2;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<VokabelKategorie> katSet = new HashSet<VokabelKategorie>();

    /**
     */
    @ManyToOne
    private VokabelKategorie katRef;
}
