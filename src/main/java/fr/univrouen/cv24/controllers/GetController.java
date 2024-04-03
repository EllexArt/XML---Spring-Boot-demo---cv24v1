package fr.univrouen.cv24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @GetMapping("/resume")
    public String getListCVinXML() {
        return "Envoi de la liste des CV";
    }

    @GetMapping("/cvid")
    public String getCVinXML(
        @RequestParam(value = "texte") String texte)
    {
        return "Détail du contenu du CV n°" + texte;
    }

    @GetMapping("/test")
    public String getTest(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "titre") String titre)
    {
        return "Test :<br>" + "id = " + id + "<br>titre = " + titre;
    }

}
