/*
 *     Minecraft GUI mod
 *     Copyright (C) 2015  Samuel Marchildon-Lavoie
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.minecraftgui.models.attributes;

import io.github.minecraftgui.models.components.Component;
import io.github.minecraftgui.models.components.State;
import io.github.minecraftgui.models.fonts.Font;

/**
 * Created by Samuel on 2015-11-05.
 */
public class AttributeGroupFont extends AttributeGroup<Font> {

    public AttributeGroupFont(Component component) {
        super(null, component);

        attributes.put(State.NORMAL, new AttributeFont(null));
        attributes.put(State.HOVER, new AttributeFont(null));
        attributes.put(State.ACTIVE, new AttributeFont(null));
        attributes.put(State.FOCUS, new AttributeFont(null));
    }

    @Override
    public Font getValue() {
        Font font = (Font) super.getValue();

        return font == null?getAttribute(State.NORMAL).getValue():font;
    }

}
