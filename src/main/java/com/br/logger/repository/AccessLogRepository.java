package com.br.logger.repository;

import com.br.logger.model.AccessLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AccessLogRepository extends CrudRepository<AccessLog, Long>, JpaSpecificationExecutor<AccessLog> {
    Page<AccessLog> findAll(Pageable pageable);
}
