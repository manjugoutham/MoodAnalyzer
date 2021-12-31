package com.java.regex.Regexuc1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void sadTest() {
		try {
			moodanalyser ma = new moodanalyser();
			String sadmsg = ma.analysemood();
			Assert.assertEquals("SAD", sadmsg);
		}catch(Exception e)
		{
			System.out.println("Happy");
		}

	}

	@Test
	public void happyTest() {
		try {
		moodanalyser ma = new moodanalyser("This is a Happy message");
		String happymsg = ma.analysemood();
		Assert.assertEquals("HAPPY", happymsg);
		}catch(Exception e)
		{
			System.out.println("Happy");
		}
	}
	
	@Test
	public void Analysemoodexception()
	{
		try {
			moodanalyser ma = new moodanalyser();
			String happymsg = ma.analysemoodexception();
			Assert.assertEquals("Sad", happymsg);
			}catch(MoodAnalysisException e)
			{
				System.out.println("The value is : Happy");
			}
	}
}
