package de.proiectus.fragen.web;
import de.proiectus.fragen.data.Kategorie;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.jquery.GvNIXWebJQuery;
import de.proiectus.fragen.data.KategorieBatchService;
import org.gvnix.addon.web.mvc.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.datatables.GvNIXDatatables;

@RequestMapping("/kategories")
@Controller
@RooWebScaffold(path = "kategories", formBackingObject = Kategorie.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = KategorieBatchService.class)
@GvNIXDatatables(ajax = true)
public class KategorieController {
}
