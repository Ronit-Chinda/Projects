package com.dbmsproject.upsideavenue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbmsproject.upsideavenue.models.AgentReport;
import com.dbmsproject.upsideavenue.models.Sales;
import com.dbmsproject.upsideavenue.models.primaryIds;

public interface SalesRepository extends JpaRepository<Sales, primaryIds>{
    // @Query(value = """
    //         select new AgentReport(posts.agent_id,/s
    //         accountname,/s
    //         count(*),/s
    //         avg(price),/s
    //         avg(datediff(sale_date, post_date)),/s
    //         0)/s
    //         from Sales s inner join Posts p on s.postId=p.postId inner join User u on
    //         p.agentId.username=u.username\s
    //         group by p.agentId\s
    //         """)

    // List<AgentReport> findAllReportsByAllAgent();

    // @Query(value = "select ")
    // public List<AgentReport> findAllReportsByAgent(String username);

}
