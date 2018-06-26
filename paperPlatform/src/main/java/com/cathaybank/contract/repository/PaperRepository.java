package com.cathaybank.contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cathaybank.contract.entity.Paper;

public interface PaperRepository extends JpaRepository<Paper, String> {

}
