/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package gov.nasa.worldwind.symbology.milstd2525.graphics.command.aviation.points;

/**
 * Implementation of the Air Control Point graphic (hierarchy 2.X.2.2.1.1, SIDC: G*GPAPP---****X).
 *
 * @author pabercrombie
 * @version $Id$
 */
public class AirControlPoint extends AbstractRoutePoint
{
    public final static String FUNCTION_ID = "APP---";

    /** {@inheritDoc} */
    public String getFunctionId()
    {
        return FUNCTION_ID;
    }

    public String getGraphicLabel()
    {
        return "ACP";
    }
}
