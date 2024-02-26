package com.entity.view;

import com.entity.YonggongbumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用工部门
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 21:57:50
 */
@TableName("yonggongbumen")
public class YonggongbumenView  extends YonggongbumenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonggongbumenView(){
	}
 
 	public YonggongbumenView(YonggongbumenEntity yonggongbumenEntity){
 	try {
			BeanUtils.copyProperties(this, yonggongbumenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
