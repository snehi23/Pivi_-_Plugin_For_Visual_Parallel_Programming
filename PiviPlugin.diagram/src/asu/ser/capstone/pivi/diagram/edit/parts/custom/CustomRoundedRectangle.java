package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;

public class CustomRoundedRectangle extends RoundedRectangle {
	public CustomRoundedRectangle() {
		super();
		setLineWidth(2);
	}

	public void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setLineStyle(Graphics.LINE_SOLID);
		graphics.setLineWidth(3);
	}
}
