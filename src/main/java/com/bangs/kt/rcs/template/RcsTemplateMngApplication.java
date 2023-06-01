package com.bangs.kt.rcs.template;

import com.bangs.kt.rcs.template.dao.RcsTmplMngRepository;
import com.bangs.kt.rcs.template.model.RcsTmplMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;
import java.util.stream.Stream;

import static java.lang.System.exit;

@SpringBootApplication
public class RcsTemplateMngApplication implements CommandLineRunner {

    @Autowired
    DataSource dataSource;

    @Autowired
    RcsTmplMngRepository rcsTmplMngRepository;

    public static void main(String[] args) {
        SpringApplication.run(RcsTemplateMngApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("DATASOURCE = " + dataSource);

        System.out.println("findAll()...");
        for (RcsTmplMng rcsTmplMng : rcsTmplMngRepository.findAll()) {
            System.out.println(rcsTmplMng);
        }

        for (RcsTmplMng rcsTmplMng : rcsTmplMngRepository.findAllBySeq(57884L)) {
            System.out.println(rcsTmplMng);
        }


        System.out.println("Done!");

        exit(0);
    }

}
