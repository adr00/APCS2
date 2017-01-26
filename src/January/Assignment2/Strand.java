package January.Assignment2;
import java.util.ArrayList;
public class Strand
{
	private ArrayList<Light> strand = new ArrayList<Light>();
	public Strand()
	{
		strand.clear();
		strand.add(new Light());
	}

	public Strand(int n)
	{
		if (n > 0)
			for (int i = 0; i < n; i++)
				strand.add(new Light());
		else
		{
			strand.clear();
			strand.add(new Light());
		}

	}

	public String toString()
	{
		String s = "";
		for (Light l: strand)
		{
			s = s + l.toString() + "\n";
		}
		return s;
	}

	// This method sets the color of all the light bulbs in the entire Strand.
	public void setColor(String c)
	{
		for (Light l: strand)
			l.setColor(c);
	}

	public void setMulti()
	{
		for (int i = 0; i < strand.size(); i++)
		{
			int remainder = i % 3;
			if (remainder == 0)
				strand.get(i).setColor("red");
			else if (remainder == 1)
				strand.get(i).setColor("green");
			else if (remainder == 2)
				strand.get(i).setColor("blue");
		}
	}

	public void turnOn()
	{
		for (Light l: strand)
		{
			if (l.isOn() == false)
				l.flip();
		}
	}
	public void turnOff()
	{
		for (Light l: strand)
		{
			if (l.isOn() == true)
				l.flip();
		}
	}

	public void burnOut(int i)
	{
		strand.get(i).burnOut();
	}


}
