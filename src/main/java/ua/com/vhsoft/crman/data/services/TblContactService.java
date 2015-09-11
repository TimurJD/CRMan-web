package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblContactRepository;
import ua.com.vhsoft.crman.mvc.models.TblContact;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblContactService")
public class TblContactService implements AbstractService<TblContact> {

	@Resource
	private TblContactRepository tblContactRepository;

	@Override
	public TblContact addOrUpdate(TblContact entity) {
		return tblContactRepository.save(entity);
	}

	@Override
	public List<TblContact> findAll(Predicate predicate) {
		return (List<TblContact>) tblContactRepository.findAll(predicate);
	}

	@Override
	public List<TblContact> findAll() {
		return tblContactRepository.findAll();
	}

	@Override
	public void delete(TblContact entity) {
		tblContactRepository.delete(entity);
	}
}