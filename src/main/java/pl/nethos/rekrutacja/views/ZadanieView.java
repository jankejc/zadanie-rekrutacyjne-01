package pl.nethos.rekrutacja.views;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.nethos.rekrutacja.konto_bankowe.KontoBankowe;
import pl.nethos.rekrutacja.konto_bankowe.KontoBankoweRepository;
import pl.nethos.rekrutacja.kontrahent.Kontrahent;
import pl.nethos.rekrutacja.kontrahent.KontrahentRepository;

@PageTitle("Zadanie")
@Route("/zadanie")
public class ZadanieView extends VerticalLayout {

    public ZadanieView(@Autowired KontrahentRepository kontrahentRepository,
                       @Autowired KontoBankoweRepository kontoBankoweRepository) {
        setSpacing(false);
        setSizeFull();
//        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");

        for (Kontrahent kontrahent : kontrahentRepository.all()) {
            add(new Label(kontrahent.toString()));
        }

        for (KontoBankowe kontoBankowe : kontoBankoweRepository.all()) {
            add(new Label(kontoBankowe.toString()));
        }
    }
}
