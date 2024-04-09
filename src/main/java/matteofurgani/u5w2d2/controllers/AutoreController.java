package matteofurgani.u5w2d2.controllers;

import matteofurgani.u5w2d2.entities.Autore;
import matteofurgani.u5w2d2.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @GetMapping("/getautori")
    public String getAutori(){
        return "questi sono gli autori";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Autore addAutore(@RequestBody Autore body) {
        return autoreService.addAutore(body);

    }


}
