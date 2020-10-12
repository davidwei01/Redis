package io.redis.jedis.jedisdemo.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.redis.jedis.jedisdemo.dao.ProgrammerRepository;
import io.redis.jedis.jedisdemo.model.Programmer;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
	
	@Autowired
	ProgrammerRepository repository;

	@Override
	public String getProgrammerAsString(String idKey) {
		return repository.getProgrammerAsString(idKey);
	}

	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		repository.setProgrammerAsString(idKey, programmer);

	}

	@Override
	public void addToProgrammerList(Programmer programmer) {
		repository.addToProgrammerList(programmer);
		
	}

	@Override
	public List<Programmer> getProgrammerListMembers() {
		return repository.getProgrammerListMembers();
	}

	@Override
	public Long getProgrammerListCount() {
		return repository.getProgrammerListCount();
	}

	@Override
	public void addToProgrammerSet(Programmer... programmers) {
		repository.addToProgrammerSet(programmers);
		
	}

	@Override
	public Set<Programmer> getProgrammerSetMembers() {
		return repository.getProgrammerSetMembers();
	}

	@Override
	public boolean isSetMemeber(Programmer programmer) {
		return repository.isSetMemeber(programmer);
	}

	@Override
	public void saveHash(Programmer programmer) {
		repository.saveHash(programmer);
		
	}

	@Override
	public void updateHash(Programmer programmer) {
		repository.saveHash(programmer);
	}

	@Override
	public Map<Integer, Programmer> findAllHash() {
		return repository.findAllHash();
	}

	@Override
	public Programmer findInHash(int id) {
		return repository.findInHash(id);
	}

	@Override
	public void deleteHash(int id) {
		repository.deleteHash(id);
	}

}
