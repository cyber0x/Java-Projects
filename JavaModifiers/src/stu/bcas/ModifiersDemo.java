package stu.bcas;

import stu.bcas.ModifiersTest;

public class ModifiersDemo {
	public static void main(String[] args) {
		ModifiersTest mt = new ModifiersTest();
		mt.release = "7";//public
	    mt.version = "7";//private
	    mt.relYear = "2015";//protected
	}

}
