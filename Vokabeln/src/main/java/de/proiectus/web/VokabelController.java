package de.proiectus.web;
import de.proiectus.data.Vokabel;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vokabels")
@Controller
@RooWebScaffold(path = "vokabels", formBackingObject = Vokabel.class)
public class VokabelController {
}
