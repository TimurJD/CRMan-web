package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblLeadRepository;
import ua.com.vhsoft.crman.mvc.models.TblLead;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblLeadService")
public class TblLeadService implements AbstractService<TblLead> {

	@Resource
	private TblLeadRepository tblLeadRepository;

	@Override
	public TblLead addOrUpdate(TblLead entity) {
		return tblLeadRepository.save(entity);
	}

	@Override
	public List<TblLead> findAll(Predicate predicate) {
		return (List<TblLead>) tblLeadRepository.findAll(predicate);
	}

	@Override
	public List<TblLead> findAll() {
		return tblLeadRepository.findAll();
	}

	@Override
	public void delete(TblLead entity) {
		tblLeadRepository.delete(entity);
	}
}