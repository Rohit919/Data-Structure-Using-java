package applet;

import java.applet.*;
import java.awt.*;

import java.util.Date;

public class GFG extends Applet {
	public void paint(Graphics g) {
		Date dt = new Date();
		super.showStatus("Today is" + dt);

	}
}