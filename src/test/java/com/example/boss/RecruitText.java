package com.example.boss;

import com.example.boss.entity.Recruit;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class RecruitText {
    @Test
    public void p1(){
        Recruit recruit = new Recruit(1,1,"heh",new Date(),new Date());
        System.out.println(recruit);
    }
}
