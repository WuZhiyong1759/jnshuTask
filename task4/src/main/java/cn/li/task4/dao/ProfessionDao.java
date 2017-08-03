package cn.li.task4.dao;


import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/4/15.
 */
@Component
public interface ProfessionDao {

 public List getProfessionWithDirection(int v_direction);
}
