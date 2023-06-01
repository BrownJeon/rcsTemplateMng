package com.bangs.kt.rcs.template.dao;

import com.bangs.kt.rcs.template.model.RcsTmplMng;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface RcsTmplMngRepository  extends CrudRepository<RcsTmplMng, Long> {

    List<RcsTmplMng> findAll();

    List<RcsTmplMng> findAllBySeq(Long seq);



}
