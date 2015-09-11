package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubContractProductRepository;
import ua.com.vhsoft.crman.mvc.models.SubContractProduct;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("subContractProductService")
public class SubContractProductService implements AbstractService<SubContractProduct> {

    @Resource
    private SubContractProductRepository subContractProductRepository;

    @Override
    public SubContractProduct addOrUpdate(SubContractProduct entity) {
        return subContractProductRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubContractProduct> findAll(Predicate predicate) {
        return (List<SubContractProduct>) subContractProductRepository.findAll(predicate);
    }

    @Override
    public List<SubContractProduct> findAll() {
        return subContractProductRepository.findAll();
    }

    @Override
    public void delete(SubContractProduct entity) {
        subContractProductRepository.delete(entity);
    }
}
