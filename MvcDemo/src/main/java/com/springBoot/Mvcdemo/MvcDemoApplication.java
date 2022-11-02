package com.springBoot.Mvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.Mvcdemo.entity.Student;
import com.springBoot.Mvcdemo.repository.StudentRepository;

@SpringBootApplication
public class MvcDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MvcDemoApplication.class, args);
	}
    @Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1=new Student("Gaya3","Kunchala","gaya3533@gmail.com");
		studentRepository.save(student1);
		*/
		
		
	}

}
