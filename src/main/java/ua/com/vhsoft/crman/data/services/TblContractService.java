package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblContractRepository;
import ua.com.vhsoft.crman.mvc.models.TblContract;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblContractService")
public class TblContractService implements AbstractService<TblContract> {

	@Resource
	private TblContractRepository tblContractRepository;

	@Override
	public TblContract addOrUpdate(TblContract entity) {
		return tblContractRepository.save(entity);
	}

	@Override
	public List<TblContract> findAll(Predicate predicate) {
		return (List<TblContract>) tblContractRepository.findAll(predicate);
	}

	@Override
	public List<TblContract> findAll() {
		return tblContractRepository.findAll();
	}

	@Override
	public void delete(TblContract entity) {
		tblContractRepository.delete(entity);
	}
}
