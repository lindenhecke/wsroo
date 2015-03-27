package de.proiectus.web;
import de.proiectus.data.VokabelKategorie;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vokabelkategories")
@Controller
@RooWebScaffold(path = "vokabelkategories", formBackingObject = VokabelKategorie.class)
public class VokabelKategorieController {
}
