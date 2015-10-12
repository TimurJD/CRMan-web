package ua.com.vhsoft.crman.data.services;

import com.mysema.query.types.Predicate;
import org.springframework.stereotype.Service;
import ua.com.vhsoft.crman.data.repositories.SubSexRepository;
import ua.com.vhsoft.crman.mvc.models.SubSex;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Service("SubSexService")
public class SubSexService implements AbstractService<SubSex> {

    @Resource
    private SubSexRepository subSexRepository;

    @Override
    public SubSex addOrUpdate(SubSex entity) {
        return subSexRepository.saveAndFlush(entity);
    }

    @Override
    public List<SubSex> findAll(Predicate predicate) {
        return (List<SubSex>) subSexRepository.findAll(predicate);
    }

    @Override
    public List<SubSex> findAll() {
        return subSexRepository.findAll();
    }

    @Override
    public void delete(SubSex entity) {
        subSexRepository.delete(entity);
    }

    @Override
    public SubSex findById(Integer id) {
        return subSexRepository.findOne(id);
    }

    @Override
    public SubSex findOne(Predicate predicate) {
        return subSexRepository.findOne(predicate);
    }

    @Override
    public void deleteById(Integer id) {
        subSexRepository.delete(id);
    }
}
