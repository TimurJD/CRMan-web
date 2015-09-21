package ua.com.vhsoft.crman.data.services;

import java.util.List;

import javax.annotation.Resource;

import com.mysema.query.types.Predicate;

import ua.com.vhsoft.crman.data.repositories.SubQuoteStageRepository;
import ua.com.vhsoft.crman.mvc.models.SubQuoteStage;

/**
 * @author Timur Berezhnoi
 *
 */
public class SubQuoteStageService implements AbstractService<SubQuoteStage> {

	@Resource
	private SubQuoteStageRepository subQuoteStageRepository;
	
	@Override
	public SubQuoteStage addOrUpdate(SubQuoteStage entity) {
		return subQuoteStageRepository.save(entity);
	}

	@Override
	public List<SubQuoteStage> findAll(Predicate predicate) {
		return (List<SubQuoteStage>) subQuoteStageRepository.findAll(predicate);
	}

	@Override
	public List<SubQuoteStage> findAll() {
		return subQuoteStageRepository.findAll();
	}

	@Override
	public void delete(SubQuoteStage entity) {
		subQuoteStageRepository.delete(entity);
	}
}