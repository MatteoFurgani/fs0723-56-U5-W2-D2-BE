package matteofurgani.u5w2d2.service;

import matteofurgani.u5w2d2.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autoriList = new ArrayList<>();

    public List<Autore> getAutoriList() {
        return this.autoriList;
    }

    public Autore addAutore(Autore body) {
        Random random = new Random();
        body.setId(random.nextInt(1000));
        this.autoriList.add(body);
        return body;
    }
}
