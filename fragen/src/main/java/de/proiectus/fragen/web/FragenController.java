package de.proiectus.fragen.web;
import de.proiectus.fragen.data.Fragen;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.gvnix.addon.web.mvc.jquery.GvNIXWebJQuery;
import de.proiectus.fragen.data.FragenBatchService;
import org.gvnix.addon.web.mvc.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.datatables.GvNIXDatatables;

@RequestMapping("/fragens")
@Controller
@RooWebScaffold(path = "fragens", formBackingObject = Fragen.class)
@RooWebFinder
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = FragenBatchService.class)
@GvNIXDatatables(ajax = true, inlineEditing = true)
public class FragenController {
}
