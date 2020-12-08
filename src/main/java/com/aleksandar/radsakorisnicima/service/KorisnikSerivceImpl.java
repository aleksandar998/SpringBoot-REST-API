package com.aleksandar.radsakorisnicima.service;

import com.aleksandar.radsakorisnicima.dao.KorisnikRepository;
import com.aleksandar.radsakorisnicima.model.Korisnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KorisnikSerivceImpl implements KorisnikService{

    private KorisnikRepository korisnikRepository;

    @Autowired
    public KorisnikSerivceImpl(KorisnikRepository korisnikRepository) {
        this.korisnikRepository = korisnikRepository;
    }

    @Override
    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    @Override
    public Optional<Korisnik> findById(int id) {
        return korisnikRepository.findById(id);
    }

    @Override
    public void save(Korisnik korisnik) {
        korisnikRepository.save(korisnik);
    }

    @Override
    public void deleteById(int id) {
        korisnikRepository.deleteById(id);
    }
}
