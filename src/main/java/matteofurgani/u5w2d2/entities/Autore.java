package matteofurgani.u5w2d2.entities;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private Date dataDiNascita;
    private String avatar;
}
