package org.javaboy.vhr.controller;

import org.javaboy.vhr.model.dto.statisticsregionDto;
import org.javaboy.vhr.model.dto.synthesize;
import org.javaboy.vhr.server.EmployeeServer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class statistics {
    @Autowired
    private EmployeeServer EmployeeServer;

    @RequestMapping("zhstatistics")
    public ArrayList statisti(){
        ArrayList<synthesize> list=this.EmployeeServer.statistics();
        System.out.println(list);
        return list;
    }
    /**
     * wgz
     * 关于地区人数统计
     */
    @RequestMapping("statisticsregion")
    public ArrayList statisticsregion(){
        ArrayList<statisticsregionDto> list=this.EmployeeServer.statisticsregion();
        return list;
    }

    /**
     * wgz
     * 关于学历人数统计
     */
    @RequestMapping("education")
    public ArrayList education(){
        ArrayList<statisticsregionDto> list=this.EmployeeServer.education();
        return list;
    }
    /**
     * wgz
     * 关于学历人数统计
     */
    @RequestMapping("major")
    public ArrayList major(){
        ArrayList<statisticsregionDto> list=this.EmployeeServer.major();
        return list;
    }
}
