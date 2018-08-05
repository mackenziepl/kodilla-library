package com.kodilla.library.controller;

import com.kodilla.library.domain.CopyDto;
import com.kodilla.library.domain.LoanDto;
import com.kodilla.library.domain.ReaderDto;
import com.kodilla.library.mapper.CopyMapper;
import com.kodilla.library.mapper.LoanMapper;
import com.kodilla.library.mapper.ReaderMapper;
import com.kodilla.library.service.DbServiceCopy;
import com.kodilla.library.service.DbServiceLoan;
import com.kodilla.library.service.DbServiceReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/loan")
public class LoanController {
    @Autowired
    private DbServiceLoan dbServiceLoan;

    @Autowired
    private LoanMapper loanMapper;

    @Autowired
    private DbServiceReader dbServiceReader;

    @Autowired
    private ReaderMapper readerMapper;

    @Autowired
    private DbServiceCopy dbServiceCopy;

    @Autowired
    private CopyMapper copyMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getLoans")
    public List<LoanDto> getLoans() {
        return loanMapper.mapToLoanDtoList(dbServiceLoan.getAllLoans());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getLoan")
    public LoanDto getLoan(@RequestParam Long loanId) throws ObjectNotFoundException {
        return loanMapper.mapToLoanDto(dbServiceLoan.getLoan(loanId).orElseThrow(ObjectNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteLoan")
    public void deleteLoan(@RequestParam Long loanId) {
        dbServiceLoan.deleteLoan(loanId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateLoan")
    public LoanDto updateLoan(@RequestBody LoanDto loanDto) {
        return loanMapper.mapToLoanDto(dbServiceLoan.saveLoan(loanMapper.mapToLoan(loanDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createLoan", consumes = APPLICATION_JSON_VALUE)
    public void createLoan(@RequestBody LoanDto loanDto, @RequestBody CopyDto copyDto, @RequestBody ReaderDto readerDto) {
        dbServiceLoan.saveLoan(loanMapper.mapToLoan(loanDto));
        dbServiceCopy.saveCopy(copyMapper.mapToCopy(copyDto));
        dbServiceReader.saveReader(readerMapper.mapToReader(readerDto));
    }
}
