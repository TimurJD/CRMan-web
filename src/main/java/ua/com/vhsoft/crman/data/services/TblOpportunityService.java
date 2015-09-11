package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblOpportunityRepository;
import ua.com.vhsoft.crman.mvc.models.TblOpportunity;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblOpportunityService")
public class TblOpportunityService implements AbstractService<TblOpportunity> {

	@Resource
	private TblOpportunityRepository tblOpportunityRepository;

	@Override
	public TblOpportunity addOrUpdate(TblOpportunity entity) {
		return tblOpportunityRepository.save(entity);
	}

	@Override
	public List<TblOpportunity> findAll(Predicate predicate) {
		return (List<TblOpportunity>) tblOpportunityRepository.findAll(predicate);
	}

	@Override
	public List<TblOpportunity> findAll() {
		return tblOpportunityRepository.findAll();
	}

	@Override
	public void delete(TblOpportunity entity) {
		tblOpportunityRepository.delete(entity);
	}
}