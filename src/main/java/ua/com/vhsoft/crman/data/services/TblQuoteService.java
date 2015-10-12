package ua.com.vhsoft.crman.data.services;

import java.util.List;

import javax.annotation.Resource;

import com.mysema.query.types.Predicate;

import ua.com.vhsoft.crman.data.repositories.TblQuoteRepository;
import ua.com.vhsoft.crman.mvc.models.TblQuote;

/**
 * @author Timur Berezhnoi
 *
 */
public class TblQuoteService implements AbstractService<TblQuote> {

    @Resource
    private TblQuoteRepository tblQuoteRepository;

    @Override
    public TblQuote addOrUpdate(TblQuote entity) {
        return tblQuoteRepository.save(entity);
    }

    @Override
    public List<TblQuote> findAll(Predicate predicate) {
        return (List<TblQuote>) tblQuoteRepository.findAll(predicate);
    }

    @Override
    public List<TblQuote> findAll() {
        return tblQuoteRepository.findAll();
    }

    @Override
    public void delete(TblQuote entity) {
        tblQuoteRepository.delete(entity);
    }

    @Override
    public TblQuote findById(Integer id) {
        return tblQuoteRepository.findOne(id);
    }

    @Override
    public TblQuote findOne(Predicate predicate) {
        return tblQuoteRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        tblQuoteRepository.delete(id);
    }
}
