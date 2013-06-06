package com.crazyteam.util;

import java.util.Date;


/**
 * 时间辅助类，用于根据当前时间获取时间段
 * 我们把时间分为3个时间段 中午 、下午、晚上
 * 上午 1，下午2，晚上3
 * 
 * @author jiangsuyong
 *
 */
public class TimeHelp {
	static public Integer getTimeNum()
	{
		
		Integer timeNum;
		Date now=new Date();
		if(now.getHours()<=13)//now是不是在13：00：00之前，也就是上午
		{
			 timeNum=1;
		}
		else if(now.getHours()<=18)//now是不是在13：00：00之后18：00：00之前，也就是下午
		{
			 timeNum=2;
		}
		else//now 在18：00：00 之后，也就是晚上
		{
			 timeNum=3;
		}
		return timeNum;
		
	}
}
