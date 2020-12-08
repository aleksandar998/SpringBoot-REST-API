package com.aleksandar.radsakorisnicima.dao;

import com.aleksandar.radsakorisnicima.model.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisnikRepository extends JpaRepository<Korisnik, Integer> {
}
