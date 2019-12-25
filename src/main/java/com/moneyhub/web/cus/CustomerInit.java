package com.moneyhub.web.cus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.moneyhub.web.pxy.Proxy;

@Component
public class CustomerInit extends Proxy implements ApplicationRunner{
	private CustomerRepository customerRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	 
	public CustomerInit(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = customerRepository.count();
		if(count == 0) {
			Customer customer = null;
						
			String[][] mix = {	{ "hong", "1", "홍길동", "010-1234-5678", "1980-01-01", "M", "4", "3", "80" },
								{ "kim", "1", "김유신", "010-3425-6564", "1980-02-12", "M", "4", "1", "90" },
								{ "park", "1", "박지성", "010-1234-6546", "1980-03-03", "M", "1", "2", "60" },
								{ "you", "1", "유관순", "010-1247-5435", "1980-04-14", "W", "2", "3", "80" },
								{ "spi", "1", "스파이더맨", "010-2545-2332", "2000-01-21", "M", "1", "1", "90" },
								{ "bet", "1", "배트맨", "010-4545-4234", "1999-02-12", "M", "2", "1", "70" },
								{ "ant", "1", "앤트맨", "010-4563-2147", "2001-03-24", "M", "3", "3", "50" },
								{ "sup", "1", "슈퍼맨", "010-4567-7562", "1990-06-06", "M", "4", "4", "80" },
								{ "won", "1", "원더우먼", "010-4534-5678", "1980-04-13", "W", "1", "1", "40" },
								{ "ion", "1", "아이언맨", "010-1274-7867", "2001-09-05", "M", "3", "2", "20" },
								{ "bla", "1", "블랙위도우", "010-67565-4577", "2002-08-07", "W", "1", "1", "70" },
								{ "spi1", "1", "스파이더맨1", "010-3241-7861", "2001-01-21", "M", "4", "4", "90" },
								{ "spi2", "1", "스파이더맨2", "010-3542-7862", "2002-01-21", "M", "1", "2", "80" },
								{ "spi3", "1", "스파이더맨3", "010-3543-7863", "2003-01-21", "M", "1", "3", "70" },
								{ "spi4", "1", "스파이더맨4", "010-3544-7864", "2004-01-21", "M", "1", "4", "60" },
								{ "spi5", "1", "스파이더맨5", "010-3545-7865", "2005-01-21", "M", "2", "1", "50" },
								{ "spi6", "1", "스파이더맨6", "010-3546-7866", "2006-01-21", "M", "2", "2", "40" },
								{ "spi7", "1", "스파이더맨7", "010-3547-7867", "2007-01-21", "M", "2", "3", "30" },
								{ "spi8", "1", "스파이더맨8", "010-3548-7868", "2008-01-21", "M", "3", "1", "20" },
								{ "spi9", "1", "스파이더맨9", "010-3549-7869", "2009-01-21", "M", "3", "2", "10" },
								{ "mo", "1", "모모", "010-3549-1869", "1994-06-05", "F", "3" ,"4", "87" },
				                { "sa", "1", "사나", "010-3549-2869", "1992-06-05", "F", "2" ,"1", "42" },
				                { "ji", "1", "지효", "010-3549-3869", "1992-06-05", "F", "1" ,"2", "98" },
				                { "da", "1", "다현", "010-3549-4869", "1994-06-05", "F", "3" ,"4", "75" },
				                { "jj", "1", "쯔위", "010-3549-5869", "1996-06-05", "F", "2" ,"3", "67" },
				                { "cy", "1", "채영", "010-3549-6869", "1999-06-05", "F", "1" ,"2", "45" },
				                { "na", "1", "나연", "010-3549-7869", "1995-06-05", "F", "2" ,"1", "82" },
				                { "jung", "1", "정연", "010-3549-8869", "1995-06-05", "F", "3" ,"3", "68" },
				                { "mi", "1", "미나", "010-3549-9869", "1992-06-05", "F", "2" ,"2", "47" },
				                { "im", "1", "임꺽정", "010-3549-0869", "1992-06-05", "M", "1" ,"4", "52" },
				                { "iu", "1", "아이유", "010-3549-0169", "1994-06-05", "F", "2" ,"4", "96" },
				                { "you", "1", "유재석", "010-3549-0269", "1998-06-05", "M", "3" ,"1", "37" },
				                { "kim", "1", "김수로", "010-3549-0369", "1990-06-05", "M", "2" ,"3", "83" },
				                { "jo", "1", "조세호", "010-3549-0469", "1991-06-05", "M", "2" ,"2", "72" },
				                { "yang", "1", "양세찬", "010-3549-0569", "1999-06-04", "M", "3" ,"2", "95"} };

			
			for(String arr[] : mix) {
				customer = new Customer();
				customer.setCemail(arr[0]);
				customer.setCpwd(arr[1]);
				customer.setCname(arr[2]);
				customer.setCphone(arr[3]);
				customer.setSdate(df.parse(arr[4]));
				customer.setGender(arr[5]);
				customer.setHak(parseInt(arr[6]));
				customer.setBan(parseInt(arr[7]));
				customer.setScore(parseInt(arr[8]));
				
				customerRepository.save(customer);
			}
		}
	}
}
