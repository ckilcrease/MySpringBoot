package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.CompactDisc;
import com.conygre.spring.boot.repos.CompactDiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CompactDiscServiceImpl implements CompactDiscService {
	
	@Autowired
	private CompactDiscRepository dao;
	
	/* (non-Javadoc)
	 * @see com.conygre.spring.boot.services.ICompactDiscService#getCatalog()
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public Iterable<CompactDisc> getCatalog() {
		// create a UnitOfWork (that contains an entity manager)
		// start the tx in the unit of work
		return dao.findAll(); // pass in the unit of work

		// when all done, commit the unit of work
	}
/*
	@Override
	public CompactDisc getCompactDiscById(int id) {
		return dao.findOne(id);
	}

	@Override
	public CompactDisc addNewCompactDisc(CompactDisc disc) {
		disc.setId(0); // assume it is not in the db
		return dao.save(disc);
	}

	
	@Override
	public CompactDisc updateCompactDisc(CompactDisc disc) {
		return dao.save(disc);
	}

	@Override
	public void deleteCompactDisc(int id) {
		dao.delete(id);
		
	}

	@Override
	public void deleteCompactDisc(CompactDisc disc) {
		deleteCompactDisc(disc.getId());
	}*/
}
