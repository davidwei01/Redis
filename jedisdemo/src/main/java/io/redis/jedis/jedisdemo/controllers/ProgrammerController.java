package io.redis.jedis.jedisdemo.controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.redis.jedis.jedisdemo.model.Programmer;
import io.redis.jedis.jedisdemo.services.ProgrammerService;

@RestController
public class ProgrammerController {

	@Autowired
	ProgrammerService service;
	
	@PostMapping("/programmer-string")
	public void addTopic(@RequestBody Programmer programmer) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		service.setProgrammerAsString(String.valueOf(programmer.getId()), mapper.writeValueAsString(programmer));
	}
	
	@GetMapping("/programmer-string/{id}")
	public String readString(@PathVariable String id) {
		return service.getProgrammerAsString(id);
	}
	
	@PostMapping("/programmer-list")
	public void addToProgrammerList(@RequestBody Programmer programmer) {
		service.addToProgrammerList(programmer);
	}
	
	@GetMapping("/programmer-list")
	public List<Programmer> getProgrammerListMembers() {
		return service.getProgrammerListMembers();
	}
	
	@GetMapping("/programmer-list/count")
	public Long getProgrammerListCount() {
		return service.getProgrammerListCount();
	}
	
	@PostMapping("/programmer-set")
	public void addToProgrammerSet(@RequestBody Programmer... programmers) {
		service.addToProgrammerSet(programmers);
	}
	
	@GetMapping("/programmer-set")
	public Set<Programmer> getProgrammerSetMembers() {
		return service.getProgrammerSetMembers();
	}
	
	@PostMapping("/programmer-set/member")
	public boolean isSetMember(@RequestBody Programmer programmer) {
		return service.isSetMemeber(programmer);
	}
	
	@PostMapping("/programmer-hash")
	public void saveHash(@RequestBody Programmer programmer) {
		service.saveHash(programmer);
	}
	
	@PutMapping("/programmer-hash")
	public void updateHash(@RequestBody Programmer programmer) {
		service.updateHash(programmer);
	}
	
	@GetMapping("/programmer-hash")
	public Map<Integer, Programmer> findAllHash() {
		return service.findAllHash();
	}
	
	@GetMapping("/programmer-hash/{id}")
	public Programmer findInHash(@PathVariable int id) {
		return service.findInHash(id);
	}
	
	@DeleteMapping("/programmer-hash/{id}")
	public void deleteHash(@PathVariable int id) {
		service.deleteHash(id);
	}
	
}
