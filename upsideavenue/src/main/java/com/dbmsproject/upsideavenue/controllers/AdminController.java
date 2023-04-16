package com.dbmsproject.upsideavenue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbmsproject.upsideavenue.models.AgentReport;

@Controller
@RequestMapping("")
@Secured({ "ADMIN" })
public class AdminController {

    @Autowired
    private SalesRepository salesRepository;

    @GetMapping("/reports/agent")
    public String agentReport(Model model) {
        List<AgentReport> reports = salesRepository.findAllReportsByAllAgent();

        model.addAttribute("reports", reports);

        return "agentReport";
    }

    @GetMapping("/reports/sales")
    public String salesReport(Model model) {
        return "salesReport";
    }
}
