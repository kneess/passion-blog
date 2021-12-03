package com.campos.brainamplified.dao;

import com.campos.brainamplified.models.TutorialPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITutorialPostRepo extends JpaRepository<TutorialPost,Long> {
}
