package cm.dv.HasA;

public class Shop {
	public static void main(String[] args) {

		Battery battery = new Battery();
		battery.size = 10000;
		battery.name = "Momo";
		Screen screen = new Screen();
		screen.size = 32;
		screen.Brand = "Sam";
		Rom rom = new Rom();
		rom.size = 16;
		rom.Brand = "intel";
		Lap lap = new Lap();
		lap.rom = rom;
		lap.battery = battery;
		lap.screen = screen;

		lap.name = "acer";
		System.out.println(lap);
		System.out.println(battery);
		System.out.println(screen);
		System.out.println(rom);

	}

}
