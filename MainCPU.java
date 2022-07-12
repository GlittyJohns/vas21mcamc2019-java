import java.util.*;
class CPU
{
	double price;
	class Processor
	{
		double no_of_cores;
		String manu;
		double getcache()
		{
			return 3.40;
		}
	}
	protected class RAM
	{
		double memory;
		String manu;
		double getclockspeed()
		{
			return 5.2;
		}
	}
}
public class MainCPU
{
	public static void main(String args[])
	{
		CPU cpu = new CPU();
		CPU.Processor p = cpu.new  Processor();
		CPU.RAM r = cpu.new RAM();
		System.out.println("Processor cache ="+p.getcache());
		System.out.println("RAM Clockspeed ="+r.getclockspeed());
	}
}