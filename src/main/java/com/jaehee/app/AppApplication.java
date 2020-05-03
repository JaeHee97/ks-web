package com.jaehee.app;

import com.jaehee.app.entity.*;
import com.jaehee.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
    private final PersonRepository personRepository;
    private final SocialMediaRepository socialMediaRepository;
    private final InterestsRepository interestsRepository;
    private final SkillRepositiory skillRepositiory;
    private final WorkRepository workRepository;

    public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepositiory skillRepositiory, WorkRepository workRepository){
        this.personRepository = personRepository;
        this.socialMediaRepository = socialMediaRepository;
        this.interestsRepository = interestsRepository;
        this.skillRepositiory = skillRepositiory;
        this.workRepository = workRepository;
    }

    public static void main(String[] args){
        SpringApplication.run(AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.save(new Person("장재희", "네트워크 관리사", "hello@test.com", "010-1234-5678"));
        socialMediaRepository.save(new SocialMedia("","","https://www.instagram.com/anonymous","https://www.facebook.com/anonymous"));
        interestsRepository.save(new Interests("헬스(목표 3대 400)"));
        interestsRepository.save(new Interests("롤(목표 다이아2)"));
        interestsRepository.save(new Interests("축구(이미 공대 축구스타)"));
        skillRepositiory.save(new Skill("C", 60));
        skillRepositiory.save(new Skill("C++", 40));
        skillRepositiory.save(new Skill("Java", 80));
        workRepository.save(new Work("신입사원","Cisco","All time","안되면 될때까지 악!"));
    }
}