package com.glearning.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.lms.model.Library;
import com.glearning.lms.repository.LibraryJpaRepository;
import com.glearning.lms.service.LibraryCreateService;

@Service
public class LibraryCreateServiceImpl implements LibraryCreateService {

	@Autowired
	private LibraryJpaRepository libraryRepository;

	@Override
	public String addSingleLibrary(Library library) {
		libraryRepository.save(library);
		libraryRepository.flush();
		return "Library saved";
	}

	@Override
	public String addAllLibraries(List<Library> libraries) {
		libraryRepository.saveAll(libraries);
		libraryRepository.flush();
		return "All Libraries are Saved";
	}

	@Override
	public Library addLibrararywithSaveAndFlush(Library library) {
		return libraryRepository.saveAndFlush(library);
	}

}
