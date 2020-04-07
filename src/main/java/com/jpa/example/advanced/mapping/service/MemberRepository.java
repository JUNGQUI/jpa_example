package com.jpa.example.advanced.mapping.service;

import com.jpa.example.advanced.mapping.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
