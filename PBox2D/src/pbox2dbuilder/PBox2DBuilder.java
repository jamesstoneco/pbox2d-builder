/**
 * PBox2dBuilder is a abstraction of Daniel Shiffman's pBox2d wrapper. It aims to provide a simple abstraction for prototyping most of the use cases with jBox2d. This means, creating objects that are rects, circles and irregular shapes. Helper methods allow easy creation of these and all objects can display themselves for simple prototyping. These display methods can be overridden to allow for more complex graphics and or sprites to be drawn over the physics objects.
 * @author James M. Stone (www.jamesjamesjames.com)
 * @version 0.1
 * @see PBox2D
 */
package pbox2dbuilder;

import org.jbox2d.common.Transform;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.joints.Joint;
import org.jbox2d.dynamics.joints.JointDef;

import processing.core.PApplet;
import processing.core.PVector;

import pbox2d.PBox2D;
import pbox2d.PContactListener;

public class PBox2DBuilder {

	PApplet parent;

	// Construct with a default scaleFactor of 10
	public PBox2DBuilder(PApplet p) {
		this(p,10);
	}

	public PBox2DBuilder(PApplet p, float sf) {
		parent = p;
		transX = parent.width/2;
		transY = parent.height/2;
		scaleFactor = sf;
		yFlip = -1;
		
	}


}




