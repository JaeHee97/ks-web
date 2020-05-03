package com.jaehee.app.repository;

import com.jaehee.app.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepositiory extends JpaRepository<Skill, Long> {
}
