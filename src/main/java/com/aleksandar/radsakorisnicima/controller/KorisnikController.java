package com.aleksandar.radsakorisnicima.controller;

import com.aleksandar.radsakorisnicima.model.Korisnik;
import com.aleksandar.radsakorisnicima.service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class KorisnikController {

    private KorisnikService korisnikService;

    @Autowired
    public KorisnikController(KorisnikService korisnikService) {
        this.korisnikService = korisnikService;
    }

    @RequestMapping(value = "/korisnici", method = RequestMethod.GET)
    public List<Korisnik> spisakKorisnika(){
        return korisnikService.findAll();
    }

    @RequestMapping(value = "/korisnici/{korisnikId}", method = RequestMethod.GET)
    public Optional<Korisnik> korisnikById(@PathVariable int korisnikId){
        Optional<Korisnik> korisnik = korisnikService.findById(korisnikId);
        return korisnik;
    }

    @RequestMapping(value = "/korisnici", method = RequestMethod.POST)
    public Korisnik addKorisnik(@RequestBody Korisnik korisnik){
        korisnik.setKorisnikId(0);
        korisnikService.save(korisnik);
        return korisnik;
    }

    @RequestMapping(value = "/korisnici", method = RequestMethod.PUT)
    public Korisnik updateKorisnik(@RequestBody Korisnik korisnik){
        korisnikService.save(korisnik);
        return korisnik;
    }

    @RequestMapping(value = "/korisnici/{korisnikId}", method = RequestMethod.DELETE)
    public String deleteKorisnik(@PathVariable int korisnikId){
        korisnikService.deleteById(korisnikId);
        return "Deleted korisnik with id - " + korisnikId;
    }
}
