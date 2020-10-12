package io.redis.jedis.jedisdemo.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.redis.jedis.jedisdemo.model.Programmer;

public interface ProgrammerService {
	//String
	public String getProgrammerAsString(String idKey);

	public void setProgrammerAsString(String idKey, String programmer);
	
	//List
	public void addToProgrammerList(Programmer programmer);
	
	public List<Programmer> getProgrammerListMembers();
	
	public Long getProgrammerListCount();
	
	//Set
	public void addToProgrammerSet(Programmer ... programmers);

	public Set<Programmer> getProgrammerSetMembers();
	
	public boolean isSetMemeber(Programmer programmer);
	
	//hash
	public void saveHash(Programmer programmer);
	
	public void updateHash(Programmer programmer);
	
	public Map<Integer, Programmer> findAllHash();
	
	public Programmer findInHash(int id);
	
	public void deleteHash(int id);
}
