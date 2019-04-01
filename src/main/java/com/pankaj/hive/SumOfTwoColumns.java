package com.pankaj.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class SumOfTwoColumns extends UDF
{
	private Text text=new Text();
	public Integer evaluate(Integer t1,Integer t2)
	{
		if(t1==null || t2==null)return null;
		Integer result = t1+t2;
		return result;
	}
}