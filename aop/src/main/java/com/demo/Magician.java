package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "magician")
 public class Magician {
	public void doMagic() {
		System.out.println("abara ka dabra....");
		//return "rabbit from the hat";
	//	throw new MagicianIllEx();
	}
	
}