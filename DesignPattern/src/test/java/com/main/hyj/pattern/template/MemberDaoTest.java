package com.main.hyj.pattern.template;

import com.main.hyj.pattern.template.jdbc.MemberDao;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * create by flytohyj  2019/7/23
 **/
public class MemberDaoTest {

    @Test
    public void memberTest(){
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
