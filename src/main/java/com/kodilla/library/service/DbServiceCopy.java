package com.kodilla.library.service;

import com.kodilla.library.domain.Copy;
import com.kodilla.library.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbServiceCopy {
    @Autowired
    CopyRepository copyRepository;

    public List<Copy> getAllCopies() {
        return copyRepository.findAll();
    }

    public Optional<Copy> getCopy(Long id) {
        return copyRepository.findById(id);
    }

    public Copy saveCopy(final Copy copy) {
        return copyRepository.save(copy);
    }

    public void deleteCopy(final Long id) {
        copyRepository.deleteById(id);
    }
}