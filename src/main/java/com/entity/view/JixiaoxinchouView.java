package com.entity.view;

import com.entity.JixiaoxinchouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 绩效薪酬
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 21:57:50
 */
@TableName("jixiaoxinchou")
public class JixiaoxinchouView  extends JixiaoxinchouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JixiaoxinchouView(){
	}
 
 	public JixiaoxinchouView(JixiaoxinchouEntity jixiaoxinchouEntity){
 	try {
			BeanUtils.copyProperties(this, jixiaoxinchouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
