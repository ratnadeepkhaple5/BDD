package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_01 {

/**@Hooks
 * 
 * hooks are like to provide pre-steps that are executed once
 * for every scripts/scenario i.e. if we have 10 scenaario's then
 * before and after each will executed 10+10 times	
 */
	@Before(order = 10000)
	public void beforehook() {
		System.out.println("before hook");
	}
	@After(order = 10000)
	public void afterhook() {
		System.out.println("after hook");
	}
	@Before
	public void setuphooh() {
		System.out.println("setup hook");
	}
	@After
	public void closehook() {
		System.out.println("close hook");
	}
	@Before("smoketest")//taggedHooks
	public void beforeSmoke() {
		System.out.println("before-smoke hook");
	}
	@After("smoketest")
	public void afterSmoke() {
		System.out.println("after-smoke hook");
	}
}
