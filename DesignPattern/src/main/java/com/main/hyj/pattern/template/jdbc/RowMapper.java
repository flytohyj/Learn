package com.main.hyj.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * create by flytohyj  2019/7/23
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
