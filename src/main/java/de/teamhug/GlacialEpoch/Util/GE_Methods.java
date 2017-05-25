package de.teamhug.GlacialEpoch.Util;

/**
 * GlacialEpoch.git, Created by Henny on 04.03.2017.
 */
public class GE_Methods
{
    // for debugging
    public static String getMetadataAsString(int meta)
    {
        StringBuilder metaString = new StringBuilder();
        for(int i = 8; i >= 1 ; i /= 2) metaString.append(((meta & i) != 0) ? 1 : 0);
        return metaString.toString();
    }
}
