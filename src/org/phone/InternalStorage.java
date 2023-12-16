package org.phone;

public class InternalStorage {
	private void processorName() {
System.out.println("Processor is MT6762");
	}
	private void ramSize() {
System.out.println("Ram size is 3 GB");
	}
	public static void main(String[] args) {
		ExternalStorage ex=new ExternalStorage();
		ex.size();
		InternalStorage in=new InternalStorage();
		in.processorName();
		in.ramSize();
	}

}
