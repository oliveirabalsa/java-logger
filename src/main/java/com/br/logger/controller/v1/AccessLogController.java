package com.br.logger.controller.v1;

import com.br.logger.model.AccessLog;
import com.br.logger.repository.AccessLogRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/access")
public class AccessLogController {

    public final AccessLogRepository accessLogRepository;

    private AccessLogController(AccessLogRepository accessLogRepository) {
        this.accessLogRepository = accessLogRepository;
    }

    @GetMapping
    private List<AccessLog> findAll() {
        return (List<AccessLog>) this.accessLogRepository.findAll();
    }

}
