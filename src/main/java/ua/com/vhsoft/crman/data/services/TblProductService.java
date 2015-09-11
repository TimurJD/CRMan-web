package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.TblProductRepository;
import ua.com.vhsoft.crman.mvc.models.TblProduct;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
@Service("tblProductService")
public class TblProductService implements AbstractService<TblProduct> {

	@Resource
	private TblProductRepository tblOrderRepository;

	@Override
	public TblProduct addOrUpdate(TblProduct entity) {
		return tblOrderRepository.save(entity);
	}

	@Override
	public List<TblProduct> findAll(Predicate predicate) {
		return (List<TblProduct>) tblOrderRepository.findAll(predicate);
	}

	@Override
	public List<TblProduct> findAll() {
		return tblOrderRepository.findAll();
	}

	@Override
	public void delete(TblProduct entity) {
		tblOrderRepository.delete(entity);
	}
}