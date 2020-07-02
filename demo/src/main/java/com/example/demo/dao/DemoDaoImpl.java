package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Domain;

@Repository
public class DemoDaoImpl implements DemoDao {

	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Domain> getUsers() {
		StringBuilder sql = new StringBuilder(
				"select id,`name` from user"
				);
		return jdbcTemplate.query(sql.toString(), BeanPropertyRowMapper.newInstance(Domain.class));
	}

}
