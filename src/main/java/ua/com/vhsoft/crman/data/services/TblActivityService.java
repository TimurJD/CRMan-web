package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblActivityRepository;
import ua.com.vhsoft.crman.mvc.models.TblActivity;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblActivityService")
public class TblActivityService implements AbstractService<TblActivity> {

	@Resource
	private TblActivityRepository tblActivityRepository;

	@Override
	public TblActivity addOrUpdate(TblActivity entity) {
		return tblActivityRepository.save(entity);
	}

	@Override
	public List<TblActivity> findAll(Predicate predicate) {
		return (List<TblActivity>) tblActivityRepository.findAll(predicate);
	}

	@Override
	public List<TblActivity> findAll() {
		return tblActivityRepository.findAll();
	}

	@Override
	public void delete(TblActivity entity) {
		tblActivityRepository.delete(entity);
	}
}
