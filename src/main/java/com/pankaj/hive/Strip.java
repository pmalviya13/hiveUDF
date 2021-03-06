/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.pankaj.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.Text;


public class Strip extends UDF{
	private Text text =new Text();

	public Text evaluate(Text text, String str)
	{
		if(text==null)return null;
		this.text.set(StringUtils.strip(text.toString(),str));
		return this.text;
	}
	public Text evaluate(Text text)
	{
		if(text==null)return null;
		this.text.set(StringUtils.strip(text.toString()));
		return this.text;
	}
}
