package com.aleksandar.radsakorisnicima.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "KORISNIK")
public class Korisnik {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "korisnik_id", unique = true)
    private int korisnikId;

    @Column(name = "Ime", length = 50, nullable = true, unique = false)
    private String ime;

    @Column(name = "prezime", length = 50, nullable = true, unique = false)
    private String prezime;

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Korisnik(int korisnikId, String ime, String prezime){
        this.korisnikId = korisnikId;
        this.ime = ime;
        this.prezime = prezime;
    }

    @ManyToMany
    @JoinTable(
            name = "korisnicki_zadaci",
            joinColumns = @JoinColumn(name = "korisnik_id"),
            inverseJoinColumns = @JoinColumn(name = "zadaci_id"))
    Set<Zadaci> zadaci;

    public Set<Zadaci> getZadaci() {
        return zadaci;
    }

    public void setZadaci(Set<Zadaci> zadaci) {
        this.zadaci = zadaci;
    }

    public Korisnik() {
    }

}
