package com.moneyhub.web.cus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyhub.web.utl.Printer;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CustomerController {

	@Autowired private CustomerRepository customerRepository;
	@Autowired private Customer customer;
	@Autowired private Printer printer;
	
	@RequestMapping("/join")
	public void join (@RequestBody Customer param){
		printer.accept("join 진입");

//		customer.setCemail(param.getCemail());
//		customer.setCpwd(param.getCpwd());
//		customer.setCname(param.getCname());
//		customer.setCphone(param.getCphone());
//		
		printer.accept(param.toString());
		
		customerRepository.save(param);
	}
	
	@RequestMapping("/login")
	public HashMap<String, Object> login(@RequestBody Customer param) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		printer.accept("로그인 진입");
		printer.accept(String.format("Cemail : %s", param.getCemail()));
		printer.accept(String.format("Cpwd : %s", param.getCpwd()));
		customer = customerRepository.
				findByCemailAndCpwd(param.getCemail(), param.getCpwd());
		if(customer != null) {
			printer.accept("로그인 성공");
			map.put("result", "SUCCESS");
			map.put("customer", customer);
			printer.accept(map.get("result"));
		}else {
			printer.accept("로그인 실패");
			map.put("result", "FAIL");
			map.put("customer", customer);
		}
		return map;
	}
	
	@DeleteMapping("/withdrawal/{cemail}")	// 회원탈퇴
	public void withdrawal(@PathVariable String cemail) {
		printer.accept("회원탈퇴 진입");
		/*
		 * customer = customerRepository.findByCemail(cemail);
		 * customerRepository.delete(customer);
		 */
		customerRepository
		.delete(customerRepository
				.findByCemail(cemail));
	}
	
	@PutMapping("/update")
	public HashMap<String, Object> update(@RequestBody Customer param) {
		printer.accept("수정 진입");
		printer.accept(param.toString());
				
		HashMap<String, Object> map = new HashMap<>();
		
		customerRepository.save(param);
		customer = customerRepository.findByCemail(param.getCemail());
		map.put("result", "SUCCESS");
		map.put("customer", customer);
		
		return map;
	}
}
