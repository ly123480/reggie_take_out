package com.jxau.reggie.dto;

import com.jxau.reggie.entity.Setmeal;
import com.jxau.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
