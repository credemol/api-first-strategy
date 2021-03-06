package io.swagger;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.acme.msr.entity.Seat;
import com.acme.msr.repository.SeatRepository;
import com.acme.msr.service.SeatService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableAutoConfiguration
@EnableJpaRepositories("com.acme.msr.repository")
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", 
		"com.acme.msr.service",  
		 "com.acme.msr.api" })
@EntityScan("com.acme.msr.entity")
public class Swagger2SpringBoot implements CommandLineRunner {

//	@Autowired
//	private SeatService seatService;

	@Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
        
//        seatService.createSeat(new Seat("12308", "12F"));
//        seatService.createSeat(new Seat("12310", "12F"));
//        seatService.createSeat(new Seat("12312", "12F"));
//        seatService.createSeat(new Seat("12314", "12F"));
//        seatService.createSeat(new Seat("12316", "12F"));
//        seatService.createSeat(new Seat("12318", "12F"));
//        seatService.createSeat(new Seat("12320", "12F"));        
    }
    
    @Bean
    public ModelMapper modelMapper() {
    		return new ModelMapper();
    }
    
    @Bean
    CommandLineRunner init(SeatRepository seatRepository) {
    		return (evt) -> {
    			seatRepository.save(new Seat("12308", "12F"));
    			seatRepository.save(new Seat("12310", "12F"));
    			seatRepository.save(new Seat("12312", "12F"));
    			seatRepository.save(new Seat("12314", "12F"));
    			seatRepository.save(new Seat("12316", "12F"));
    			seatRepository.save(new Seat("12318", "12F"));
    			seatRepository.save(new Seat("12320", "12F"));
    		};
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
