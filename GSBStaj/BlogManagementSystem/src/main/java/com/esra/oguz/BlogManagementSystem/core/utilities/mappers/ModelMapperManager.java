package com.esra.oguz.BlogManagementSystem.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {
	private ModelMapper modelMapper;
	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);  //gevşek map leme : vt deki alanların hepsini değil de response sınıfında (nesnesinde) olan kadar map leme yaptığımda bana kızma demek.
		return this.modelMapper;

	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD); //Standart map leme : Ben reques aldığımda her şey map lensin her şeyin bir karşılığı olsun olmazsa kız demek.
		return this.modelMapper;
	}

}
