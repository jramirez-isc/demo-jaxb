package classes;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

public class Main {

	@XmlRootElement
	public static class Data {
		@XmlAttribute
		private int x;
	}

	public static void main(String[] args) {
		JAXB.marshal(new Data(), System.out);
	}

}