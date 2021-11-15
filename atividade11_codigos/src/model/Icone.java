package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Icone {
	private File file;
	private BufferedImage bufferImage;
	ImageIcon icone;
	public static final String URL_ICONE = "/img/age.png";

	public Icone(String urlFile) throws IOException {
		try {
			file = new File(urlFile);
			bufferImage = ImageIO.read(file);
			icone = new ImageIcon(bufferImage);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public ImageIcon getIcone() {
		return icone;
	}
}