package com.campos.brainamplified.dao;

import com.campos.brainamplified.models.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInstructionRepo extends JpaRepository<Instruction,Long> {
}
