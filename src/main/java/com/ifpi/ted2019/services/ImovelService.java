package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Imovel;
import com.ifpi.ted2019.repositories.ImovelRepository;

@Service
public class ImovelService {

	@Autowired

	private ImovelRepository repository;

	public Imovel buscar(Integer id) {
		Optional<Imovel> object = repository.findById(id);
		return object.orElse(null);

	}

}