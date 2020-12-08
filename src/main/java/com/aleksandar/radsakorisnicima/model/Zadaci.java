package com.aleksandar.radsakorisnicima.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "ZADACI")
public class Zadaci {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zadaci_id", unique = true)
    private int zadaciId;

    @Column(name = "Naziv", length = 50, nullable = true, unique = false)
    private String naziv;

    @Column(name = "Uradjen", length = 50, nullable = true, unique = false)
    private Boolean uradjen;

    @Column(name = "Rok_za_izradu", length = 50, nullable = true, unique = false)
    private LocalDateTime rokZaIzradu;

    public int getZadaciId() {
        return zadaciId;
    }

    public void setZadaciId(int zadaciId) {
        this.zadaciId = zadaciId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Boolean getUradjen() {
        return uradjen;
    }

    public void setUradjen(Boolean uradjen) {
        this.uradjen = uradjen;
    }

    public LocalDateTime getRokZaIzradu() {
        return rokZaIzradu;
    }

    public void setRokZaIzradu(LocalDateTime rokZaIzradu) {
        this.rokZaIzradu = rokZaIzradu;
    }

    public Zadaci(int zadaciId, String naziv, Boolean uradjen, LocalDateTime rokZaIzradu){
        this.zadaciId = zadaciId;
        this.naziv = naziv;
        this.uradjen = uradjen;
        this.rokZaIzradu = rokZaIzradu;
    }

    @ManyToMany(mappedBy = "zadaci", cascade = CascadeType.MERGE)
    Set<Korisnik> korisnici;

    public Set<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(Set<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Zadaci() {
    }
}
