package com.entity.view;

import com.entity.MianshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 面试记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 21:57:50
 */
@TableName("mianshijilu")
public class MianshijiluView  extends MianshijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianshijiluView(){
	}
 
 	public MianshijiluView(MianshijiluEntity mianshijiluEntity){
 	try {
			BeanUtils.copyProperties(this, mianshijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
