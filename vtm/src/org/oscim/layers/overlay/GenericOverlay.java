/*
 * Copyright 2012 Hannes Janetzek
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.oscim.layers.overlay;

import org.oscim.view.MapView;
import org.oscim.renderer.RenderLayer;

public class GenericOverlay extends Overlay {
	/**
	 * @param mapView
	 *            ...
	 * @param renderer
	 *            ...
	 */
	public GenericOverlay(MapView mapView, RenderLayer renderer) {
		super(mapView);
		mLayer = renderer;
	}
}