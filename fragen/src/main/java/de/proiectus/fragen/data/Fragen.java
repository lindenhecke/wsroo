package de.proiectus.fragen.data;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findFragensByKat", "findFragensByKattype" })
public class Fragen {

    /**
     */
    private String frage;

    /**
     */
    private String antwort;

    /**
     */
    @ManyToOne
    private Kategorie kat;

    /**
     */
    @Enumerated
    private FragenKategorie kattype;
}
