package com.bluehorn.springmvc.util;

import org.jenkinsci.testinprogress.runner.ProgressSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ProgressSuite.class)
@SuiteClasses({ SimpleCalculatorTest.class })
public class ProgressAllTestsSuite {

}