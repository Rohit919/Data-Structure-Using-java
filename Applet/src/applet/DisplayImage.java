package applet;

import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet {

	Image picture;

	public void init() {
		picture = getImage(getDocumentBase(), "IMG_3944.JPG");
	}

	public void paint(Graphics g) {
		g.drawImage(picture, 30, 30, this);
	}

}