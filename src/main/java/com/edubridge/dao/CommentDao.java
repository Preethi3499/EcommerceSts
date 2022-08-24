package com.edubridge.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.Comment;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {

} 
