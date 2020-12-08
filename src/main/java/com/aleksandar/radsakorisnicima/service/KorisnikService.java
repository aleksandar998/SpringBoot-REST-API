package com.aleksandar.radsakorisnicima.service;

import com.aleksandar.radsakorisnicima.model.Korisnik;

import java.util.List;
import java.util.Optional;

public interface KorisnikService {
    public List<Korisnik> findAll();
    public Optional<Korisnik> findById(int id);
    public void save(Korisnik korisnik);
    public void deleteById(int id);
}
