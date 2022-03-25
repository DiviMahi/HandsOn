package cm.dv.HasA;

public class Lap {

	String name;
	Rom rom;
	Screen screen;
	Battery battery;

	@Override
	public String toString() {
		return "Lap [name=" + name + ", rom=" + rom + ", screen=" + screen + ", battery=" + battery + "]";
	}

}
