package de.proiectus.fragen.data;
import org.gvnix.addon.jpa.batch.GvNIXJpaBatch;
import org.springframework.stereotype.Service;

@Service
@GvNIXJpaBatch(entity = Fragen.class)
public class FragenBatchService {
}
