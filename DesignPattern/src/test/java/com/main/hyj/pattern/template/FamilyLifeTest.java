package com.main.hyj.pattern.template;

import com.main.hyj.pattern.template.example.*;

/**
 * create by flytohyj  2019/7/23
 **/
public class FamilyLifeTest {

    public static void main(String[] args) {
        System.out.println("---儿子---");
        FamilyLife sonLife = new SonLife();
        sonLife.createLife();
        System.out.println("---父亲---");
        FamilyLife dadLife = new DadLife(true);
        dadLife.createLife();
        System.out.println("---母亲---");
        FamilyLife monLife = new MonLife(true);
        monLife.createLife();
        System.out.println("---爷爷---");
        FamilyLife grandPaLife = new GrandPaLife(false);
        grandPaLife.createLife();

    }

}
